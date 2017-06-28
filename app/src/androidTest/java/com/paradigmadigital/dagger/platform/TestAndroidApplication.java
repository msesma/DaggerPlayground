package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.DaggerTestApplicationComponent;

public class TestAndroidApplication extends AndroidApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        DaggerTestApplicationComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }
}
