package eu.sesma.dagger.platform;

import eu.sesma.dagger.ui.AppCollaborator;
import eu.sesma.dagger.ui.IAppCollaborator;

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
