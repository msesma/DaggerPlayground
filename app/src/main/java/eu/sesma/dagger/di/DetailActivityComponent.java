package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityModule;
import eu.sesma.dagger.platform.DetailActivityModule;
import eu.sesma.dagger.ui.detail.DetailActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = { ActivityModule.class, DetailActivityModule.class})
public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DetailActivity> {
    }
}
