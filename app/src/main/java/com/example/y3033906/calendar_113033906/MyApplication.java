package com.example.y3033906.calendar_113033906;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;


public class MyApplication extends Application {
    private static Context context;

    public void onCreate(){
        super.onCreate();
        MyApplication.context = getApplicationContext();

    }

    public static Context getAppContext(){
        return MyApplication.context;
    }
}
