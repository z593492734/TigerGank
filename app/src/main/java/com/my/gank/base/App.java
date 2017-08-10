package com.my.gank.base;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

import com.my.gank.receiver.NetworkChangeReceiver;

/**
 * Author：mengyuan
 * Date  : 2017/8/4下午5:50
 * E-Mail:mengyuanzz@126.com
 * Desc  :
 */

public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this.getApplicationContext();

        //注册
        NetworkChangeReceiver networkChangeReceiver = new NetworkChangeReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeReceiver, filter);
    }


}
