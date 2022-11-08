package com.test.wanandroid.Adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.wanandroid.Activity.WebActivity;
import com.test.wanandroid.Model.HomeArticleModel;
import com.test.wanandroid.R;

import java.util.List;

/**
 * 作者：weisongsong on 2022/10/27
 * <p>
 * 邮箱：15231167995@163.com
 */
public class TreeArticleAdapter extends RecyclerView.Adapter<TreeArticleAdapter.ViewHolder> {

    private List<HomeArticleModel.DataBean.DatasBean> list;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View recyclerView;
        TextView articleTime,articleTitle,articleAuthor,articleTag;
        public ViewHolder (View view){
            super(view);
            recyclerView = view;
            articleTime = (TextView) view.findViewById(R.id.tv_time);
            articleTitle = (TextView) view.findViewById(R.id.tv_title);
            articleAuthor = (TextView) view.findViewById(R.id.tv_author);
            articleTag = (TextView) view.findViewById(R.id.tv_tag);
        }
    }

    public TreeArticleAdapter(List<HomeArticleModel.DataBean.DatasBean> homeList){
        list = homeList;
        Log.d("TAG", "HomeArticleAdapter: "+list.size());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_article_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomeArticleModel.DataBean.DatasBean datasBean = list.get(position);
        holder.articleAuthor.setText(datasBean.getAuthor());
        holder.articleTag.setText(datasBean.getSuperChapterName()+"/"+datasBean.getChapterName());
        holder.articleTime.setText(datasBean.getNiceDate());
        holder.articleTitle.setText(datasBean.getTitle());
        holder.recyclerView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                HomeArticleModel.DataBean.DatasBean datasBean = list.get(position);
                Intent intent = new Intent(v.getContext(),WebActivity.class);
                intent.putExtra("uri",datasBean.getLink());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
