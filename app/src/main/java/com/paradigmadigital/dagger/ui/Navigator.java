package com.paradigmadigital.dagger.ui;

import com.paradigmadigital.dagger.ui.another.AnotherActivity;
import com.paradigmadigital.dagger.ui.detail.DetailActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import javax.inject.Inject;

public class Navigator {

    private static final String TAG = Navigator.class.getSimpleName();

    private final Context context;
    private final IAppCollaborator appColaborator;
    private final ActCollaborator actColaborator;
    private final BaseActivity activity;

    @Inject
    public Navigator(Context context,
            IAppCollaborator colaborator,
            ActCollaborator actColaborator,
            BaseActivity activity) {
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
        Intent intent = new Intent(activity, AnotherActivity.class);
        activity.startActivity(intent);
    }

    private void showLogs() {
        Log.d(TAG, "Context (App): " + context +
                " \r\nActivity: " + activity +
                " \r\nAppCollaborator: " + appColaborator +
                " \r\nActCollaborator: " + actColaborator);
    }
}
