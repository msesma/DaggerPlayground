package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.PerActivity;
import eu.sesma.dagger.ui.ActCollaborator;
import eu.sesma.dagger.ui.BaseActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    BaseActivity provideActivity() {
        return this.activity;
    }

    @Provides
    @PerActivity
    ActCollaborator provideActCollaborator() {
        return new ActCollaborator();
    }
}
