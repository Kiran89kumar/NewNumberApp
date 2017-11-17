package com.numerus.numberapp.di.modules;

import android.app.Activity;
import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kiran.kumar on 10/11/17.
 */

@Module
public class ActivityModule {

    public ActivityModule(Activity activity){
        this.activity = activity;
    }

    @Provides
    Activity activity(){
        return this.activity;
    }

    @Provides
    @Named("ActivityContext")
    Context context() {
        return this.activity;
    }

    private Activity activity;
}
