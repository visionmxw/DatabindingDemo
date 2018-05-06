package com.example.maxiaowei.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maxiaowei.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        user = new User();
        mainBinding.setUser(user);
        mainBinding.setHandler(new LoginHandler(MainActivity.this,user));

    }
}
