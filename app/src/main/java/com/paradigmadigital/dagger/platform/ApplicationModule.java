package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.ui.AppColaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
//    private final AndroidApplication application;
//
//    public ApplicationModule(AndroidApplication application) {
//        this.application = application;
//    }

    @Provides
    Context provideContext(AndroidApplication application) {
        return application;
    }

    @Provides
    @Singleton
    AppColaborator provideAppCollaborator() {
        return new AppColaborator();
    }
}
