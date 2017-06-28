package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.ui.IAppCollaborator;
import com.paradigmadigital.dagger.ui.TestAppCollaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestApplicationModule {

    @Provides
    Context provideContext(AndroidApplication application) {
        return application;
    }

    @Provides
    @Singleton
    IAppCollaborator provideAppCollaborator() {
        return new TestAppCollaborator();
    }
}
