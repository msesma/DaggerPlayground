package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.PerActivity;
import eu.sesma.dagger.ui.ActCollaborator;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class ActivityModule {
    @Provides
    @PerActivity
    static ActCollaborator provideActCollaborator() {
        return new ActCollaborator();
    }
}
