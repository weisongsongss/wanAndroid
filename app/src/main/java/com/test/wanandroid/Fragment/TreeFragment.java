package com.test.wanandroid.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.test.wanandroid.Adapter.HomeArticleAdapter;
import com.test.wanandroid.Adapter.TreeAdapter;
import com.test.wanandroid.Compl.TreeCompl;
import com.test.wanandroid.Interface.ITreePresenter;
import com.test.wanandroid.Interface.ITreeView;
import com.test.wanandroid.Model.HomeArticleModel;
import com.test.wanandroid.Model.TreeModel;
import com.test.wanandroid.R;
import com.test.wanandroid.databinding.FragmentTreeBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：weisongsong on 2022/5/7
 * <p>
 * 邮箱：15231167995@163.com
 */
public class TreeFragment extends Fragment implements ITreeView {

    private static final String TAG = "TreeFragment";
    private static final int ERROR = 1;
    private static final int SUCCESS = 0;
    private ITreePresenter treePresenter;
    private TreeModel treeModel;
    private List<TreeModel.DataBean> treeList = new ArrayList<>();
    private RecyclerView recyclerView;
    private TreeAdapter adapter;


    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            switch (message.what){
                case ERROR:
                    Toast.makeText(getActivity(), "获取失败", Toast.LENGTH_SHORT).show();
                    break;
                case SUCCESS:
                    adapter.notifyDataSetChanged();
                    break;
                default:
                    break;
            }
        }
    };

    public TreeFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tree,container,false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.tree_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        adapter = new TreeAdapter(treeList);
        recyclerView.setAdapter(adapter);

        //获取数据
        treePresenter = new TreeCompl(this);
        treePresenter.getTree(0);



        return view;

    }


    @Override
    public void onGetTreeResult(String string) {
        Log.d("TAG", "onGetTreeResult: "+string);
        Gson gson = new Gson();
        treeModel = gson.fromJson(string,TreeModel.class);
        Message message = new Message();
        if (treeModel.getErrorCode() != 0){
            message.what = ERROR;
        }else{
            treeList.addAll(treeModel.getData());
            message.what = SUCCESS;
        }
        handler.sendMessage(message);
    }
}
