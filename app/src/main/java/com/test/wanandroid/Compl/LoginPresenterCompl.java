package com.test.wanandroid.Compl;

import com.test.wanandroid.Interface.ILoginPresenter;
import com.test.wanandroid.Interface.ILoginView;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * 作者：weisongsong on 2022/5/6
 * <p>
 * 邮箱：15231167995@163.com
 */
public class LoginPresenterCompl implements ILoginPresenter {

    ILoginView loginView;

    OkHttpClient client = new OkHttpClient();

    public LoginPresenterCompl(ILoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void doLogin(String username, String password) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    RequestBody requestBody = new FormBody.Builder()
                            .add("username",username)
                            .add("password",password)
                            .build();
                    Request request = new Request.Builder()
                            .url("https://www.wanandroid.com/user/login")
                            .post(requestBody)
                            .build();
                    Response response = client.newCall(request).execute();
                    loginView.onLoginResult(response.body().string());
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
