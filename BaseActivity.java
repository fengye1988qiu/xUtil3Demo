package com.leo.xutil3demo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.netease.nimlib.sdk.NIMClient;
import com.netease.nimlib.sdk.Observer;
import com.netease.nimlib.sdk.StatusCode;
import com.netease.nimlib.sdk.auth.AuthServiceObserver;

import org.xutils.x;

public class BaseActivity extends AppCompatActivity implements Observer<StatusCode>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        NIMClient.getService(AuthServiceObserver.class).observeOnlineStatus(this,true);
    }


    @Override
    public void onEvent(StatusCode statusCode){}
}
