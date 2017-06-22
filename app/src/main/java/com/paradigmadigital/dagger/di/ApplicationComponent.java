package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ActivityBindingModule;
import com.paradigmadigital.dagger.platform.AndroidApplication;
import com.paradigmadigital.dagger.platform.ApplicationModule;
import com.paradigmadigital.dagger.ui.AppColaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        ActivityBindingModule.class,
        ApplicationModule.class
})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(AndroidApplication application);

        ApplicationComponent build();
    }

    ActivityComponent.Builder getActivityComponentBuilder();

    //Exposed to sub-graphs
    Context provideContext();

    AppColaborator provideAppCollaborator();
}
