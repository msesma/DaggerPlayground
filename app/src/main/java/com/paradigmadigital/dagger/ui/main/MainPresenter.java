package com.paradigmadigital.dagger.ui.main;

import com.paradigmadigital.dagger.ui.Navigator;

import javax.inject.Inject;

public class MainPresenter {

    private final Navigator navigator;

    @Inject
    public MainPresenter(Navigator navigator) {
        this.navigator = navigator;
    }

    public void initialize() {

    }

    public void onClick() {
        navigator.navigateToDetail();
    }
}
