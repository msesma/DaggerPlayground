package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.ApplicationComponent;
import eu.sesma.dagger.di.DaggerApplicationComponent;

import android.app.Application;

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent = createComponent();

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    protected ApplicationComponent createComponent() {
        return DaggerApplicationComponent.builder()
                .application(this)
                .build();
    }
}
