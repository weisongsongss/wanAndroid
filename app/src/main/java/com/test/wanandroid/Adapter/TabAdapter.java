package com.test.wanandroid.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import com.test.wanandroid.Fragment.ShowFragment;
import com.test.wanandroid.Model.TreeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：weisongsong on 2022/11/7
 * <p>
 * 邮箱：15231167995@163.com
 */
public class TabAdapter extends FragmentStateAdapter {

    private List<TreeModel.DataBean.ChildrenBean> childrenBeans;

    public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        if(childrenBeans == null){
            childrenBeans = new ArrayList<>();
        }
    }

    public void addChild(TreeModel.DataBean.ChildrenBean data){
        if(childrenBeans != null){
            childrenBeans.add(data);
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return ShowFragment.newInstance(childrenBeans,position);
    }

    @Override
    public int getItemCount() {
        return childrenBeans.size();
    }
}
