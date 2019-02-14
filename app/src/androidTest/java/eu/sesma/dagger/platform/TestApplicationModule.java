package eu.sesma.dagger.platform;

import eu.sesma.dagger.ui.IAppCollaborator;
import eu.sesma.dagger.ui.TestAppCollaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TestApplicationModule {
    private final AndroidApplication application;

    public TestApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    Context provideContext() {
        return this.application;
    }

    @Provides
    @Singleton
    IAppCollaborator provideAppCollaborator() {
        return new TestAppCollaborator();
    }
}
