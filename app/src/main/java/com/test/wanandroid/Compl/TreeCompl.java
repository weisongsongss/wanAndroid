package com.test.wanandroid.Compl;

import com.test.wanandroid.Interface.IHomeArticleView;
import com.test.wanandroid.Interface.ITreePresenter;
import com.test.wanandroid.Interface.ITreeView;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 作者：weisongsong on 2022/11/1
 * <p>
 * 邮箱：15231167995@163.com
 */
public class TreeCompl implements ITreePresenter {

    ITreeView treeView;

    OkHttpClient client = new OkHttpClient();
    String tree = "https://www.wanandroid.com/tree/json";
    String navi = "https://www.wanandroid.com/navi/json";


    public TreeCompl(ITreeView treeView){
        this.treeView = treeView;
    }

    @Override
    public void getTree(int i) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
//                    RequestBody requestBody = new FormBody.Builder()
//                            .add("username",username)
//                            .add("password",password)
//                            .build();
                    Request request = new Request.Builder()
                            .url(i==0? tree:navi)
                            .build();
                    Response response = client.newCall(request).execute();
                    treeView.onGetTreeResult(response.body().string());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
