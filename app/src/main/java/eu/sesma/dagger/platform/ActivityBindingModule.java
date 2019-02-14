package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.ActivityComponent;
import eu.sesma.dagger.di.ActivityKey;
import eu.sesma.dagger.ui.BaseActivity;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityComponent.class)
abstract public class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(BaseActivity.class)
    abstract ActivityComponent.Builder baseActivity(ActivityComponent.Builder impl);
}
