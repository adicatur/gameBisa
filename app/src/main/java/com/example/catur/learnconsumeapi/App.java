package com.example.catur.learnconsumeapi;

import android.app.Application;
import android.content.Context;

/**
 * Created by catur on 1/2/18.
 */

public class App extends Application {

    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

}
