package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ApplicationModule;
import com.paradigmadigital.dagger.ui.AppColaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {

    //Exposed to sub-graphs
    Context provideContext();

    AppColaborator provideAppCollaborator();
}
