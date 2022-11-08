package com.test.wanandroid.Adapter;

import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.flexbox.FlexboxLayout;
import com.test.wanandroid.Activity.WebActivity;
import com.test.wanandroid.Model.NaviModel;
import com.test.wanandroid.Model.TreeModel;
import com.test.wanandroid.R;

import java.util.List;

/**
 * 作者：weisongsong on 2022/11/1
 * <p>
 * 邮箱：15231167995@163.com
 */
public class NaviAdapter extends RecyclerView.Adapter<NaviAdapter.ViewHolder> {

    private static final String TAG = "NaviAdapter";
    private List<NaviModel.DataBean> list;
    private int i=0;

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

    public NaviAdapter(List<NaviModel.DataBean> treeList){
        list = treeList;
        Log.d("TAG", "HomeArticleAdapter: "+list.size());
    }

    @NonNull
    @Override
    public NaviAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tree_item,parent,false);
        NaviAdapter.ViewHolder viewHolder = new NaviAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NaviAdapter.ViewHolder holder, int position) {
        NaviModel.DataBean dataBean = list.get(position);
        holder.title.setText(dataBean.getName());
        for (i = 0; i < dataBean.getArticles().size(); i++){
            TextView textView = new TextView(holder.flexboxLayout.getContext());
            textView.setText(dataBean.getArticles().get(i).getTitle());
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
            textView.setAutoLinkMask(Linkify.ALL);
            textView.setMovementMethod(LinkMovementMethod.getInstance());

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),WebActivity.class);
                    Log.d(TAG, "onClick: "+dataBean.getArticles().get(i).getLink());
                    intent.putExtra("uri",dataBean.getArticles().get(i).getLink());
                    v.getContext().startActivity(intent);
                }
            });

            holder.flexboxLayout.addView(textView);
        }
//        holder.recyclerView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                int position = holder.getAdapterPosition();
//                NaviModel.DataBean datasBean = list.get(position);
//                Intent intent = new Intent(v.getContext(), WebActivity.class);
//                v.getContext().startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
