package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.PerActivity;
import eu.sesma.dagger.ui.main.MainActivity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainActivityModule {
    @Provides
    @PerActivity
    static Activity provideActivity(MainActivity activity) {
        return activity;
    }
}
