package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.AndroidApplication;
import com.paradigmadigital.dagger.platform.ApplicationModule;
import com.paradigmadigital.dagger.ui.AppColaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(AndroidApplication application);

        ApplicationComponent build();
    }

    //Exposed to sub-graphs
    Context provideContext();

    AppColaborator provideAppCollaborator();
}
