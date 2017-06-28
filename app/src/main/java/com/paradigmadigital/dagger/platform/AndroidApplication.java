package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.ApplicationComponent;
import com.paradigmadigital.dagger.di.DaggerApplicationComponent;

import android.app.Application;

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent = createComponent();

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    protected ApplicationComponent createComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
