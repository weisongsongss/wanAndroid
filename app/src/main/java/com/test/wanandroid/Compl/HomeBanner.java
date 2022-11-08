package com.test.wanandroid.Compl;

import com.test.wanandroid.Interface.IHomeBannerPresenter;
import com.test.wanandroid.Interface.IHomeBannerView;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者：weisongsong on 2022/10/27
 * <p>
 * 邮箱：15231167995@163.com
 */
public class HomeBanner implements IHomeBannerPresenter {


    IHomeBannerView homeView;

    OkHttpClient client = new OkHttpClient();

    public HomeBanner(IHomeBannerView homeView){
        this.homeView = homeView;
    }

    @Override
    public void getBanner() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    RequestBody requestBody = new FormBody.Builder()
//                            .add("username",username)
//                            .add("password",password)
//                            .build();
                    Request request = new Request.Builder()
                            .url("https://www.wanandroid.com/banner/json")
                            .build();
                    Response response = client.newCall(request).execute();
                    homeView.onGetBannerResult(response.body().string());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

    @Override
    public void setProgressBarVisibility(int visibility) {

    }
}
