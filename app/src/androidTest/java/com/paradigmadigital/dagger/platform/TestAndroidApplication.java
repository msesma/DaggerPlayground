package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.ApplicationComponent;
import com.paradigmadigital.dagger.di.DaggerTestApplicationComponent;

public class TestAndroidApplication extends AndroidApplication {
    @Override
    protected ApplicationComponent createComponent() {
        return DaggerTestApplicationComponent.builder()
                .application(this)
                .build();
    }
}
