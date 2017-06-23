package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.PerActivity;
import com.paradigmadigital.dagger.ui.ActColaborator;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ActivityModule {
    @Provides
    @PerActivity
    static ActColaborator provideActCollaborator() {
        return new ActColaborator();
    }
}
