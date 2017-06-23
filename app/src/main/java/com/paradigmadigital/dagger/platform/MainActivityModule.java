package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.PerActivity;
import com.paradigmadigital.dagger.ui.main.MainActivity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {
    @Provides
    @PerActivity
    static Activity provideActivity(MainActivity activity) {
        return activity;
    }
}
