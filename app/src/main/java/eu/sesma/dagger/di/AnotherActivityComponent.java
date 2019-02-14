package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityModule;
import eu.sesma.dagger.ui.another.AnotherActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = { ActivityModule.class })
public interface AnotherActivityComponent extends AndroidInjector<AnotherActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AnotherActivity> {
    }
}
