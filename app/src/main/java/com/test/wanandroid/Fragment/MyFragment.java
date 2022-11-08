package com.test.wanandroid.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.test.wanandroid.Activity.LoginActivity;
import com.test.wanandroid.MainActivity;
import com.test.wanandroid.R;
import com.test.wanandroid.Tools.SharedPreferencesTool;

/**
 * 作者：weisongsong on 2022/5/7
 * <p>
 * 邮箱：15231167995@163.com
 */
public class MyFragment extends Fragment {
    public MyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my,container,false);

        LinearLayout llLogout = view.findViewById(R.id.ll_logout);
        llLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setMessage("确定退出登录吗？");
                dialog.setCancelable(false);
                dialog.setPositiveButton("是", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferencesTool.setParam(getActivity(),"username","");
                        SharedPreferencesTool.setParam(getActivity(),"email","");
                        SharedPreferencesTool.setParam(getActivity(),"id",0);
                        SharedPreferencesTool.setParam(getActivity(),"type",0);
                        startActivity(new Intent(getActivity(), LoginActivity.class));
                        getActivity().finish();
                    }
                });
                dialog.setNegativeButton("否", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
