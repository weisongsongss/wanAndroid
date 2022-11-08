package com.test.wanandroid;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.test.wanandroid.Fragment.HomeFragment;
import com.test.wanandroid.Fragment.MyFragment;
import com.test.wanandroid.Fragment.NaviFragment;
import com.test.wanandroid.Fragment.TreeFragment;
import com.test.wanandroid.databinding.ActivityMainBinding;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {

    private static final String TAG = "MainActivity";

    private static final int NUM_PAGES = 4;

    private FragmentStateAdapter pagerAdapter;


    private ActivityMainBinding binding;

    ViewPager2.OnPageChangeCallback callback = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            changeTabState(position);
        }
    };

    private static boolean isAppExit = false;


    /**
     * 保存在手机里面的文件名
     */

    private static final String FILE_NAME = "wanAndroid_share_data";

    private static Handler mHandler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            isAppExit = false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initView();

    }

    private void initView(){

        RadioButton[] rbs = new RadioButton[4];
        rbs[0] = binding.rbHome;
        rbs[1] = binding.rbTree;
        rbs[2] = binding.rbNavi;
        rbs[3] = binding.rbMy;

        for (RadioButton rb: rbs){
            Drawable[] drawables = rb.getCompoundDrawables();
            //定义一个Rect边界
            Rect r = new Rect(0, 0, drawables[1].getMinimumWidth()*1/10, drawables[1].getMinimumHeight()*1/10);
            drawables[1].setBounds(r);
            rb.setCompoundDrawables(null,drawables[1],null,null);
        }

        pagerAdapter = new ScreenSlidePagerAdapter(this);
        binding.pager.setAdapter(pagerAdapter);
        binding.rgTabBar.setOnCheckedChangeListener(this);
        binding.pager.setCurrentItem(0);
        binding.rbHome.setChecked(true);

        binding.pager.registerOnPageChangeCallback(callback);


//        NavController navController = Navigation.findNavController(MainActivity.this,binding.pager.getId());
//        AppBarConfiguration appBarConfiguration =
//                new AppBarConfiguration.Builder(navController.getGraph()).build();
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        NavigationUI.setupWithNavController(
//                toolbar, navController, appBarConfiguration);
    }


    @Override
    public void onBackPressed() {
        exit();
    }

    private void exit(){
        //实现两次back退出程序功能
        if (!isAppExit){
            isAppExit = true;
            Toast.makeText(this, "再按一次后退出程序", Toast.LENGTH_SHORT).show();
            mHandler.sendEmptyMessageDelayed(0,2000);
        }else finish();
    }

    public static void startActivity(Context context){
        Intent intent = new Intent(context,MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_home:
                binding.pager.setCurrentItem(0);
                break;
            case R.id.rb_tree:
                binding.pager.setCurrentItem(1);
                break;
            case R.id.rb_navi:
                binding.pager.setCurrentItem(2);
                break;
            case R.id.rb_my:
                binding.pager.setCurrentItem(3);
                break;
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStateAdapter{

        public ScreenSlidePagerAdapter(FragmentActivity fragmentActivity){
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            Log.d(TAG, position+"");
            Fragment fragment= null;
            if (position == 0){
                fragment = new HomeFragment();
            }else if (position == 1){
                fragment = new TreeFragment();
            }else if (position == 2){
                fragment = new NaviFragment();
            }else if (position == 3){
                fragment = new MyFragment();
            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }

    private void changeTabState(int item){
        switch (item){
            case 0:
                binding.rbHome.setChecked(true);
                binding.rbTree.setChecked(false);
                binding.rbNavi.setChecked(false);
                binding.rbMy.setChecked(false);
                break;
            case 1:
                binding.rbHome.setChecked(false);
                binding.rbTree.setChecked(true);
                binding.rbNavi.setChecked(false);
                binding.rbMy.setChecked(false);
                break;
            case 2:
                binding.rbHome.setChecked(false);
                binding.rbTree.setChecked(false);
                binding.rbNavi.setChecked(true);
                binding.rbMy.setChecked(false);
                break;
            case 3:
                binding.rbHome.setChecked(false);
                binding.rbTree.setChecked(false);
                binding.rbNavi.setChecked(false);
                binding.rbMy.setChecked(true);
                break;
            default:
                break;
        }
    }

    //Toolbar的菜单


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.scanning:
                Toast.makeText(this, "扫描二维码", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        binding.pager.unregisterOnPageChangeCallback(callback);
    }

}