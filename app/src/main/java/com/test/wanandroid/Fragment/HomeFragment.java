package com.test.wanandroid.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.gson.Gson;
import com.test.wanandroid.Activity.LoginActivity;
import com.test.wanandroid.Adapter.HomeArticleAdapter;
import com.test.wanandroid.Compl.HomeArticleCompl;
import com.test.wanandroid.Compl.HomeBanner;
import com.test.wanandroid.Interface.IHomeArticlePresenter;
import com.test.wanandroid.Interface.IHomeArticleView;
import com.test.wanandroid.Interface.IHomeBannerPresenter;
import com.test.wanandroid.Interface.IHomeBannerView;
import com.test.wanandroid.MainActivity;
import com.test.wanandroid.Model.BannerModel;
import com.test.wanandroid.Model.HomeArticleModel;
import com.test.wanandroid.R;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 作者：weisongsong on 2022/5/7
 * <p>
 * 邮箱：15231167995@163.com
 */
public class HomeFragment extends Fragment implements IHomeBannerView , IHomeArticleView {

    private static final int LOGIN_ERROR = 1;
    private static final int LOGIN_SUCCESS = 0;
    Context context = getContext();
    private static final String TAG = "HomeFragment";
    private ProgressBar progressBar;
    IHomeBannerPresenter homePresenter;
    IHomeArticlePresenter homeArticlePresenter;
    BannerModel bannerModel;
    HomeArticleModel homeArticleModel;
    Banner banner;
    List<String> bannerAddressList = new ArrayList<>();
    List<HomeArticleModel.DataBean.DatasBean> homeArticleList = new ArrayList<>();
    RecyclerView recyclerView;
    HomeArticleAdapter adapter;

    SwipeRefreshLayout swipeRefreshLayout;

    int atriclePage = 0;//获取文章的页码

    public HomeFragment() {

    }


    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            switch (message.what){
                case LOGIN_ERROR:
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(getActivity(), "文章获取失败", Toast.LENGTH_SHORT).show();
                    break;
                case LOGIN_SUCCESS:
                    progressBar.setVisibility(View.GONE);
                    adapter.notifyDataSetChanged();
                    swipeRefreshLayout.setRefreshing(false);
                    break;
                default:
                    break;
            }
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        progressBar = view.findViewById(R.id.progress_bar_home);
        //首页轮播图
        homePresenter = new HomeBanner(this);
//        homePresenter.getBanner();//网络获取首页轮播图的图片，直接用glide的话，以下代码就可以，但是实际项目中肯定会有替换图片的情况，所以写了一个网络请求来备份
        banner = view.findViewById(R.id.banner);
        bannerAddressList.add("https://www.wanandroid.com/blogimgs/42da12d8-de56-4439-b40c-eab66c227a4b.png");
        bannerAddressList.add("https://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png");
        bannerAddressList.add("https://www.wanandroid.com/blogimgs/50c115c2-cf6c-4802-aa7b-a4334de444cd.png");
        banner.setAdapter(new BannerImageAdapter<String>(bannerAddressList) {
            @Override
            public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                Glide.with(holder.itemView).load(data).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(holder.imageView);
            }
        });

        banner.setIndicator(new CircleIndicator(getActivity()));

        //获取首页文章列表
        homeArticlePresenter = new HomeArticleCompl(this);
        homeArticlePresenter.getArticle(atriclePage);
        atriclePage++;


        //滑动列表
        recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        adapter = new HomeArticleAdapter(homeArticleList);
        recyclerView.setAdapter(adapter);

        FloatingActionButton floatingActionButton = view.findViewById(R.id.floating);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(view,"删除数据",Snackbar.LENGTH_SHORT)
                        .setAction("取消", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getActivity(), "1111111111111111111", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Intent.ACTION_VIEW);
                                intent.setData(Uri.parse("https://www.jianshu.com/p/e946cf746dc0"));
                                v.getContext().startActivity(intent);
                            }
                        }).show();
            }
        });

        //下拉刷新
        swipeRefreshLayout = view.findViewById(R.id.swipe_refresh);
        swipeRefreshLayout.setColorSchemeResources(R.color.grey);
        if (swipeRefreshLayout.isRefreshing()){
            swipeRefreshLayout.setRefreshing(false);
        }
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                homeArticlePresenter.getArticle(atriclePage);
                atriclePage++;
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onGetBannerResult(String string) {

        Log.d("TAG", "Banner == "+string);
        Gson gson = new Gson();

        bannerModel = gson.fromJson(string,BannerModel.class);
        for (int i = 0 ; i < bannerModel.getData().size();i++){
            bannerAddressList.add(bannerModel.getData().get(i).getImagePath());
            Log.d("TAG", "onGetBannerResult: bannerAddressList的第"+i+"个内容为："+bannerAddressList.get(i));
        }
        banner.setAdapter(new BannerImageAdapter<String>(bannerAddressList) {

            @Override
            public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                Glide.with(holder.itemView).load(data).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(holder.imageView);
            }
        });
        banner.setIndicator(new CircleIndicator(getActivity()));
    }

    @Override
    public void onGetArticleResult(String string) {

        Log.d(TAG, "onGetArticleResult: string == " + string);
        Message message = new Message();
        if (string == null){
            message.what = LOGIN_ERROR;
        }else {
            Gson gson = new Gson();
            homeArticleModel = gson.fromJson(string,HomeArticleModel.class);
            homeArticleList.addAll(0,homeArticleModel.getData().getDatas());
            message.what = LOGIN_SUCCESS;
        }
        handler.sendMessage(message);
    }

}
