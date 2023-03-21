package com.test.wanandroid.Fragment;

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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.test.wanandroid.Adapter.NaviAdapter;
import com.test.wanandroid.Adapter.TreeAdapter;
import com.test.wanandroid.Compl.TreeCompl;
import com.test.wanandroid.Interface.ITreePresenter;
import com.test.wanandroid.Interface.ITreeView;
import com.test.wanandroid.Model.NaviModel;
import com.test.wanandroid.Model.TreeModel;
import com.test.wanandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：weisongsong on 2022/5/7
 * <p>
 * 邮箱：15231167995@163.com
 */
public class NaviFragment extends Fragment implements ITreeView {

    private static final String TAG = "NaviFragment";
    private static final int ERROR = 1;
    private static final int SUCCESS = 0;
    private ITreePresenter treePresenter;
    private NaviModel naviModel;
    private List<NaviModel.DataBean> treeList = new ArrayList<>();
    private RecyclerView recyclerView;
    private NaviAdapter adapter;
    private ProgressBar progressBar;


    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            switch (message.what){
                case ERROR:
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(getActivity(), "获取失败", Toast.LENGTH_SHORT).show();
                    break;
                case SUCCESS:
                    progressBar.setVisibility(View.GONE);
                    adapter.notifyDataSetChanged();
                    break;
                default:
                    break;
            }
        }
    };


    public NaviFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navi,container,false);

        progressBar = view.findViewById(R.id.progress_bar_navi);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.navi_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        adapter = new NaviAdapter(treeList);
        recyclerView.setAdapter(adapter);

        //获取数据
        treePresenter = new TreeCompl(this);
        treePresenter.getTree(1);
        return view;
    }
    @Override
    public void onGetTreeResult(String string) {
        Gson gson = new Gson();
        naviModel = gson.fromJson(string,NaviModel.class);
        for (int i = 0 ;i<naviModel.getData().size();i++){
            Log.d(TAG, "onGetTreeResult: "+naviModel.getData().get(i).getName());
        }
        Message message = new Message();
        if (naviModel.getErrorCode() != 0){
            message.what = ERROR;
        }else{
            treeList.addAll(naviModel.getData());
            message.what = SUCCESS;
        }
        handler.sendMessage(message);
    }
}
