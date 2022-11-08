package com.test.wanandroid.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.test.wanandroid.Adapter.HomeArticleAdapter;
import com.test.wanandroid.Model.TreeModel;
import com.test.wanandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：weisongsong on 2022/11/7
 * <p>
 * 邮箱：15231167995@163.com
 */
public class ShowFragment extends Fragment {



    public ShowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ShowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShowFragment newInstance(List<TreeModel.DataBean.ChildrenBean> childrenBeans, int item) {
        ShowFragment fragment = new ShowFragment();
        Bundle args = new Bundle();
        args.putSerializable("color",(ArrayList<TreeModel.DataBean.ChildrenBean>)childrenBeans);
        args.putInt("item",item);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        HomeArticleAdapter adapter = new HomeArticleAdapter(homeArticleList);
        recyclerView.setAdapter(adapter);
//        view.<TextView>findViewById(R.id.tv_show)
//                .setText(((ArrayList<TreeModel.DataBean.ChildrenBean>) getArguments()
//                .getSerializable("color")).get(getArguments().getInt("item")).getName());
        super.onViewCreated(view, savedInstanceState);
    }
}
