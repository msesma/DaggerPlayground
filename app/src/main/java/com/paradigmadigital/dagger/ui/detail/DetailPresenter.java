package com.paradigmadigital.dagger.ui.detail;

import com.paradigmadigital.dagger.ui.ActColaborator;
import com.paradigmadigital.dagger.ui.Navigator;

import android.util.Log;

import javax.inject.Inject;

public class DetailPresenter {

    private static final String TAG = DetailPresenter.class.getSimpleName();

    private final Navigator navigator;
    private final ActColaborator actColaborator;

    @Inject
    public DetailPresenter(Navigator navigator, ActColaborator actColaborator) {
        this.navigator = navigator;
        this.actColaborator = actColaborator;
    }

    public void initialize() {

    }

    public void onClick() {
        showLogs();
        navigator.navigateToAnother();
    }

    private void showLogs() {
        Log.d(TAG, "ActCollaborator: " + actColaborator);
    }
}
