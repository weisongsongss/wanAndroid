package com.test.wanandroid.Activity;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.test.wanandroid.Compl.LoginPresenterCompl;
import com.test.wanandroid.Interface.ILoginPresenter;
import com.test.wanandroid.Interface.ILoginView;
import com.test.wanandroid.MainActivity;
import com.test.wanandroid.Model.LoginModel;
import com.test.wanandroid.R;
import com.test.wanandroid.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity implements ILoginView,View.OnClickListener{

    private static final String TAG = "LoginActivity";
    private static final int LOGIN_ERROR = 1;
    private static final int LOGIN_SUCCESS = 0;
    private ActivityLoginBinding binding;
    ILoginPresenter loginPresenter;
    ProgressDialog progressDialog;
    LoginModel loginModel;

    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            switch (message.what){
                case LOGIN_ERROR:
                    Toast.makeText(LoginActivity.this, loginModel.getErrorMsg(), Toast.LENGTH_SHORT).show();
                    break;
                case LOGIN_SUCCESS:
                    setParam("username",loginModel.getData().getUsername());
                    setParam("email",loginModel.getData().getEmail());
                    setParam("id",loginModel.getData().getId());
                    setParam("type",loginModel.getData().getType());
                    MainActivity.startActivity(LoginActivity.this);
                    finish();
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        checkSharedPreferences();
        loginPresenter = new LoginPresenterCompl(this);

        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("正在登陆...");
        progressDialog.setMessage("请稍后");
        progressDialog.setCancelable(true);

        binding.btnForget.setOnClickListener(this);
        binding.btnRegister.setOnClickListener(this);
        binding.btnLogin.setOnClickListener(this);
    }

    private void checkSharedPreferences() {
        //检查是否已登录
        if (!getParam("username","").equals("")&& !getParam("id",0).equals("") && !getParam("type",0).equals("")){
            //已登录，跳转至主页
            MainActivity.startActivity(this);
            finish();
        }

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_forget:
                Toast.makeText(this, "请前往wanandroid官网进行找回密码", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_register:
                Toast.makeText(this, "注册", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_login:
                checkParams(binding.etUsername.getText().toString(),binding.etPassword.getText().toString());
                break;
            default:
                break;
        }
    }

    private void checkParams(String username,String password){
        if (!username.isEmpty() && !username.equals("") && !password.isEmpty() && !password.equals("")){
            progressDialog.show();
            loginPresenter.doLogin(username,password);
        }else
            Toast.makeText(this, "账号或密码不能为空，请重新输入", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginResult(String string) {
        Log.d(TAG, string);
        progressDialog.dismiss();
        Gson gson = new Gson();
        loginModel = gson.fromJson(string,LoginModel.class);
        Message message = new Message();
        if (loginModel.getData() == null){
            message.what = LOGIN_ERROR;
        }else
            message.what = LOGIN_SUCCESS;
        handler.sendMessage(message);
    }
}