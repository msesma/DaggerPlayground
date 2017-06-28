package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.PerActivity;
import com.paradigmadigital.dagger.ui.ActCollaborator;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ActivityModule {
    @Provides
    @PerActivity
    static ActCollaborator provideActCollaborator() {
        return new ActCollaborator();
    }
}
