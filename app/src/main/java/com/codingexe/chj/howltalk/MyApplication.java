package com.codingexe.chj.howltalk;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by chj on 2017-12-21.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        FirebaseApp.initializeApp(this);
    }
}
