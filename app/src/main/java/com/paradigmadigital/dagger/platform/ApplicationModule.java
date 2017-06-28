package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.ui.AppCollaborator;
import com.paradigmadigital.dagger.ui.IAppCollaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    Context provideContext(AndroidApplication application) {
        return application;
    }

    @Provides
    @Singleton
    IAppCollaborator provideAppCollaborator() {
        return new AppCollaborator();
    }
}
