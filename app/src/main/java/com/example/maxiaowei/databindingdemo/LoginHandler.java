package com.example.maxiaowei.databindingdemo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

public class LoginHandler {
    private Context context;
    private User user;

    public LoginHandler(Context context,User user){
        this.context = context;
        this.user = user;
    }

    public void onClickLogin(View view) {
        if (TextUtils.isEmpty(user.getStraffId())) {
            Toast.makeText(context, "请输入工号", Toast.LENGTH_SHORT).show();
        } else if(TextUtils.isEmpty(user.getPassword())){
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
        }else if(user.isEnable()){
            Toast.makeText(context, "去登录啦", Toast.LENGTH_SHORT).show();
        }
    }
}
