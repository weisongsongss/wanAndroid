package com.test.wanandroid.Compl;

import com.test.wanandroid.Interface.IHomeArticlePresenter;
import com.test.wanandroid.Interface.IHomeArticleView;
import com.test.wanandroid.Interface.IHomeBannerView;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者：weisongsong on 2022/10/27
 * <p>
 * 邮箱：15231167995@163.com
 */
public class HomeArticleCompl implements IHomeArticlePresenter {


    IHomeArticleView homeArticleView;

    OkHttpClient client = new OkHttpClient();

    String address = "https://www.wanandroid.com/article/list/";
    String page;

    public HomeArticleCompl(IHomeArticleView homeArticleView){
        this.homeArticleView = homeArticleView;
    }

    @Override
    public void getArticle(int i) {
        page = i+"";
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    RequestBody requestBody = new FormBody.Builder()
//                            .add("username",username)
//                            .add("password",password)
//                            .build();
                    Request request = new Request.Builder()
                            .url(address+page+"/json")
                            .build();
                    Response response = client.newCall(request).execute();
                    homeArticleView.onGetArticleResult(response.body().string());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
