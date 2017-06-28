package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ActivityModule;
import com.paradigmadigital.dagger.platform.MainActivityModule;
import com.paradigmadigital.dagger.ui.main.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@PerActivity
@Subcomponent(modules = {ActivityModule.class, MainActivityModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
