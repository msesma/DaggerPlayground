package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ActivityBindingModule;
import com.paradigmadigital.dagger.platform.AndroidApplication;
import com.paradigmadigital.dagger.platform.TestApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBindingModule.class,
        TestApplicationModule.class
})
public interface TestApplicationComponent extends ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(AndroidApplication application);

        ApplicationComponent build();
    }
}
