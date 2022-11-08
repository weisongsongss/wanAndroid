package com.test.wanandroid.Adapter;

import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.flexbox.FlexboxLayout;
import com.test.wanandroid.Activity.ViewPagerActivity;
import com.test.wanandroid.Activity.WebActivity;
import com.test.wanandroid.Model.HomeArticleModel;
import com.test.wanandroid.Model.TreeModel;
import com.test.wanandroid.R;

import java.util.List;

/**
 * 作者：weisongsong on 2022/11/1
 * <p>
 * 邮箱：15231167995@163.com
 */
public class TreeAdapter extends RecyclerView.Adapter<TreeAdapter.ViewHolder> {

    private List<TreeModel.DataBean> list;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View recyclerView;
        TextView title;
        FlexboxLayout flexboxLayout;
        public ViewHolder (View view){
            super(view);
            recyclerView = view;
            title = (TextView) view.findViewById(R.id.title_tree_item);
            flexboxLayout = (FlexboxLayout) view.findViewById(R.id.flexbox);
        }
    }

    public TreeAdapter(List<TreeModel.DataBean> treeList){
        list = treeList;
        Log.d("TAG", "HomeArticleAdapter: "+list.size());
    }

    @NonNull
    @Override
    public TreeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tree_item,parent,false);
        TreeAdapter.ViewHolder viewHolder = new TreeAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TreeAdapter.ViewHolder holder, int position) {
        TreeModel.DataBean dataBean = list.get(position);
        holder.title.setText(dataBean.getName());
        for (int i = 0; i < dataBean.getChildren().size(); i++){
            TextView textView = new TextView(holder.flexboxLayout.getContext());
            textView.setText(dataBean.getChildren().get(i).getName());
            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setPadding(20,10,20,10);
            textView.setBackgroundResource(R.drawable.radius_border);

            RelativeLayout.LayoutParams lp= new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(0, 0, 20, 20);
            //RelativeLayout可以通过LayoutParams的addRule来添加约束，其他的布局也有类似的一些方法
            lp.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            lp.addRule(RelativeLayout.ALIGN_PARENT_END);
            textView.setLayoutParams(lp);
            textView.setTextSize(15);

            holder.flexboxLayout.addView(textView);
        }
        holder.recyclerView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                TreeModel.DataBean datasBean = list.get(position);
                Intent intent = new Intent(v.getContext(),ViewPagerActivity.class);
                intent.putExtra("data",datasBean);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
