package com.numerus.numberapp.di;

import com.numerus.numberapp.NumerusApp;
import com.numerus.numberapp.di.modules.ApplicationModule;
import com.numerus.numberapp.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by kiran.kumar on 11/17/17.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
        NetworkModule.class,
        BuildersModule.class
})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(NumerusApp app);

        ApplicationComponent build();
    }

    void inject(NumerusApp app);
}
