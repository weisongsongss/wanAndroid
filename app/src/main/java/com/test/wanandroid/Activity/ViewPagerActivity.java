package com.test.wanandroid.Activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.test.wanandroid.Adapter.TabAdapter;
import com.test.wanandroid.Model.TreeModel;
import com.test.wanandroid.R;
import com.test.wanandroid.databinding.ActivityLoginBinding;
import com.test.wanandroid.databinding.ActivityViewPagerBinding;

public class ViewPagerActivity extends AppCompatActivity {

    private static final String TAG = "ViewPagerActivity";
    private ActivityViewPagerBinding binding;
    private ViewPager2 vpTab;
    private TabLayout tabVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewPagerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        TreeModel.DataBean dataBea = (TreeModel.DataBean) getIntent().getSerializableExtra("data");

        binding.title.setText(dataBea.getName());

        TabAdapter adapter = new TabAdapter(this);
        vpTab = findViewById(R.id.vp_tb);
        tabVp = findViewById(R.id.tb_vp);
        vpTab.setAdapter(adapter);   // 这句很重要！！！
        tabVp.setTabTextColors(Color.parseColor("#111111"), Color.parseColor("#0371DD"));


        for (int i = 0; i < dataBea.getChildren().size(); i++) {
            tabVp.addTab(tabVp.newTab().setText(dataBea.getChildren().get(i).getName()));
            adapter.addChild(dataBea.getChildren().get(i));
        }

        tabVp.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpTab.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

        vpTab.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabVp.setScrollPosition(position, 0, false);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }


    public static void startActivity(Context context) {
        Intent intent = new Intent(context, ViewPagerActivity.class);
        context.startActivity(intent);
    }
}