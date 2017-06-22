package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.di.ActivityComponent;
import com.paradigmadigital.dagger.di.ActivityKey;
import com.paradigmadigital.dagger.ui.BaseActivity;

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
