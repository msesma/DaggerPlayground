package com.paradigmadigital.dagger.ui;

import com.paradigmadigital.dagger.ui.detail.DetailActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import javax.inject.Inject;

public class Navigator {

    private static final String TAG = Navigator.class.getSimpleName();

    private final Context context;
    private final AppColaborator appColaborator;
    private final ActColaborator actColaborator;
    private final Activity activity;

    @Inject
    public Navigator(Context context,
            AppColaborator colaborator,
            ActColaborator actColaborator,
            Activity activity) {
        this.context = context;
        this.appColaborator = colaborator;
        this.actColaborator = actColaborator;
        this.activity = activity;
    }

    public void navigateToDetail() {
        showLogs();
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    public void navigateToAnother() {
        showLogs();
        Intent intent = new Intent(activity, DetailActivity.class);
        activity.startActivity(intent);
    }

    private void showLogs() {
        Log.d(TAG, "Context (App): " + context +
                " \r\nActivity: " + activity +
                " \r\nAppCollaborator: " + appColaborator +
                " \r\nActCollaborator: " + actColaborator);
    }
}
