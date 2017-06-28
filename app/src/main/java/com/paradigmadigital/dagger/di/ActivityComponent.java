package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.ActivityModule;
import com.paradigmadigital.dagger.ui.another.AnotherActivity;
import com.paradigmadigital.dagger.ui.detail.DetailActivity;
import com.paradigmadigital.dagger.ui.main.MainActivity;

import dagger.Subcomponent;

@PerActivity
@Subcomponent(
        modules = ActivityModule.class
)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);

    void inject(AnotherActivity anotherActivity);

}
