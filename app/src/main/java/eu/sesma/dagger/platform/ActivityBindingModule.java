package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.ActivityKey;
import eu.sesma.dagger.di.AnotherActivityComponent;
import eu.sesma.dagger.di.DetailActivityComponent;
import eu.sesma.dagger.di.MainActivityComponent;
import eu.sesma.dagger.ui.another.AnotherActivity;
import eu.sesma.dagger.ui.detail.DetailActivity;
import eu.sesma.dagger.ui.main.MainActivity;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {
        MainActivityComponent.class,
        DetailActivityComponent.class,
        AnotherActivityComponent.class
})
abstract public class ActivityBindingModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> mainActivityInjectorFactory(
            MainActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(DetailActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> detailActivityInjectorFactory(
            DetailActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(AnotherActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> anotherActivityInjectorFactory(
            AnotherActivityComponent.Builder builder);
}
