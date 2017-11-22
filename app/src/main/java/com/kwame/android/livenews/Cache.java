package com.kwame.android.livenews;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Kwame on 2/2/2017.
 */
public class Cache extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

       FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
