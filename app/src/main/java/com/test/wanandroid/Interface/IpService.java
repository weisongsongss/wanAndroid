package com.test.wanandroid.Interface;

import com.test.wanandroid.Model.BannerModel;
import com.test.wanandroid.Model.LoginModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 作者：weisongsong on 2022/5/11
 * <p>
 * 邮箱：15231167995@163.com
 */
public interface IpService {
    @GET("/banner/json")
    Call<BannerModel> getIpMsg();
}
