package eu.sesma.dagger.ui;

import eu.sesma.dagger.ui.another.AnotherActivity;
import eu.sesma.dagger.ui.detail.DetailActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import javax.inject.Inject;

public class Navigator {

    private static final String TAG = Navigator.class.getSimpleName();

    private final Context context;
    private final IAppCollaborator appCollaborator;
    private final ActCollaborator actCollaborator;
    private final Activity activity;

    @Inject
    public Navigator(Context context,
            IAppCollaborator colaborator,
            ActCollaborator actColaborator,
            Activity activity) {
        this.context = context;
        this.appCollaborator = colaborator;
        this.actCollaborator = actColaborator;
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
                " \r\nAppCollaborator: " + appCollaborator +
                " \r\nActCollaborator: " + actCollaborator);
    }
}
