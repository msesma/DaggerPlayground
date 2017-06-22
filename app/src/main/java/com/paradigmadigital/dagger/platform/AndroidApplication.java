package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.ApplicationComponent;
import com.paradigmadigital.dagger.di.DaggerApplicationComponent;

import android.app.Application;

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override

    public void onCreate() {
        super.onCreate();

        this.applicationComponent = DaggerApplicationComponent.builder()
                .application(this)
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
