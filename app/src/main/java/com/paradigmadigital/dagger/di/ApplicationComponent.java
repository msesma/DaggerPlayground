package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ApplicationModule;
import com.paradigmadigital.dagger.ui.IAppCollaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import eu.sesma.core.CoreCollaborator;

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {

    //Exposed to sub-graphs
    Context provideContext();

    IAppCollaborator provideAppCollaborator();
}
