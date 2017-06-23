package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.PerActivity;
import com.paradigmadigital.dagger.ui.detail.DetailActivity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DetailActivityModule {
    @Provides
    @PerActivity
    static Activity provideActivity(DetailActivity activity) {
        return activity;
    }
}
