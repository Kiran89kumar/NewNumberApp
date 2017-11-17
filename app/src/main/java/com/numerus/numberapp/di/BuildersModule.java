package com.numerus.numberapp.di;

import com.numerus.numberapp.di.modules.NumerusModule;
import com.numerus.numberapp.ui.activity.NumerusActivity;
import com.numerus.numberapp.ui.fragment.NumerusFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by kiran.kumar on 11/17/17.
 */

@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract NumerusActivity bindNumerusActivity();


    @ContributesAndroidInjector(modules = {NumerusModule.class})
    abstract NumerusFragment bindNumerusFragment();
}
