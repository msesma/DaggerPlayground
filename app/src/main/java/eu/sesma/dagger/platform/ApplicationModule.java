package eu.sesma.dagger.platform;

import android.content.Context;

import eu.sesma.dagger.ui.AppCollaborator;
import eu.sesma.dagger.ui.IAppCollaborator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    Context provideContext() {
        return this.application;
    }

    @Provides
    @Singleton
    IAppCollaborator provideAppCollaborator() {
        return new AppCollaborator();
    }
}
