package com.test.wanandroid.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.test.wanandroid.Interface.IpService;
import com.test.wanandroid.Model.BannerModel;
import com.test.wanandroid.Model.LoginModel;
import com.test.wanandroid.R;
import com.test.wanandroid.databinding.ActivityTestBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";
    private ActivityTestBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTestBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.wanandroid.com/";
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(url)
                        //增加返回值为json的支持
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                IpService ipService = retrofit.create(IpService.class);
                Call<BannerModel> call = ipService.getIpMsg();
                call.enqueue(new Callback<BannerModel>() {
                    @Override
                    public void onResponse(Call<BannerModel> call, Response<BannerModel> response) {
                        String country = response.body().toString();
                        Log.d(TAG, "onResponse: "+country);
                        binding.text.setText(response.body().getErrorCode()+"");
                    }

                    @Override
                    public void onFailure(Call<BannerModel> call, Throwable t) {

                    }
                });
            }
        });
    }
}