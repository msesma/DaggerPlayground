package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.PerActivity;
import com.paradigmadigital.dagger.ui.ActColaborator;
import com.paradigmadigital.dagger.ui.BaseActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    BaseActivity provideActivity() {
        return this.activity;
    }

    @Provides
    @PerActivity
    ActColaborator provideActCollaborator() {
        return new ActColaborator();
    }
}
