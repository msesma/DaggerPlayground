package com.paradigmadigital.dagger.ui.detail;

import com.paradigmadigital.dagger.ui.ActCollaborator;
import com.paradigmadigital.dagger.ui.Navigator;

import android.util.Log;

import javax.inject.Inject;

public class DetailPresenter {

    private static final String TAG = DetailPresenter.class.getSimpleName();

    private final Navigator navigator;
    private final ActCollaborator actColaborator;

    @Inject
    public DetailPresenter(Navigator navigator, ActCollaborator actColaborator) {
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
