package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ActivityModule;
import com.paradigmadigital.dagger.ui.another.AnotherActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = { ActivityModule.class })
public interface AnotherActivityComponent extends AndroidInjector<AnotherActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AnotherActivity> {
    }
}
