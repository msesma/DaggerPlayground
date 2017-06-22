package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.ActivityKey;
import com.paradigmadigital.dagger.di.AnotherActivityComponent;
import com.paradigmadigital.dagger.di.DetailActivityComponent;
import com.paradigmadigital.dagger.di.MainActivityComponent;
import com.paradigmadigital.dagger.ui.another.AnotherActivity;
import com.paradigmadigital.dagger.ui.detail.DetailActivity;
import com.paradigmadigital.dagger.ui.main.MainActivity;

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
