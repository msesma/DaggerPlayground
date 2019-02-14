package eu.sesma.dagger.ui;

import eu.sesma.dagger.di.ActivityComponent;
import eu.sesma.dagger.di.ApplicationComponent;
import eu.sesma.dagger.platform.AndroidApplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    private ActivityComponent activityComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.activityComponent = getApplicationComponent()
                .getActivityComponentBuilder()
                .activity(this)
                .build();
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
