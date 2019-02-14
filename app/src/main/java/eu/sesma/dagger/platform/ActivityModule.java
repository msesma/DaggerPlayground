package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.PerActivity;
import eu.sesma.dagger.ui.ActCollaborator;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    @PerActivity
    ActCollaborator provideActCollaborator() {
        return new ActCollaborator();
    }
}
