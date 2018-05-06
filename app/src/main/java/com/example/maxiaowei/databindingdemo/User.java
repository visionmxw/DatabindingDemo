package com.example.maxiaowei.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

public class User extends BaseObservable {
    private String straffId;
    private String password;
    private boolean enable;

    @Bindable
    public String getStraffId() {
        return straffId;
    }

    public void setStraffId(String straffId) {
        this.straffId = straffId;
        if (!TextUtils.isEmpty(straffId) && !TextUtils.isEmpty(password) && password.length() >= 6) {
            enable = true;
        } else {
            enable = false;
        }
        setEnable(enable);
        notifyPropertyChanged(BR.straffId);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (!TextUtils.isEmpty(straffId) && !TextUtils.isEmpty(password) && password.length() >= 6) {
            enable = true;
        } else {
            enable = false;
        }
        setEnable(enable);
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
        notifyPropertyChanged(BR.enable);
    }
}
