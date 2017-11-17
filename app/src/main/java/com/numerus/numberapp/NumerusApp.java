package com.numerus.numberapp;

import android.app.Activity;
import android.app.Application;

import com.numerus.numberapp.di.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by kiran.kumar on 11/17/17.
 */

public class NumerusApp extends Application implements HasActivityInjector {

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
}
