package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.PerActivity;
import com.paradigmadigital.dagger.ui.ActColaborator;
import com.paradigmadigital.dagger.ui.main.MainActivity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    @Provides
    @PerActivity
    ActColaborator provideActCollaborator() {
        return new ActColaborator();
    }

    @Provides
    @PerActivity
    Activity provideActivity(MainActivity activity) {
        return activity;
    }
}
