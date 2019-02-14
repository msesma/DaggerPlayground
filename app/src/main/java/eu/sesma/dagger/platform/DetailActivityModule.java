package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.PerActivity;
import eu.sesma.dagger.ui.detail.DetailActivity;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DetailActivityModule {
    @Provides
    @PerActivity
    static Activity provideActivity(DetailActivity activity) {
        return activity;
    }
}
