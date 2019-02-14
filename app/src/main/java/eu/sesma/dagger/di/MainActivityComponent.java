package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityModule;
import eu.sesma.dagger.platform.MainActivityModule;
import eu.sesma.dagger.ui.main.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = {ActivityModule.class, MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
