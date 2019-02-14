package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.DaggerTestApplicationComponent;

public class TestAndroidApplication extends AndroidApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        DaggerTestApplicationComponent.builder()
                .application(this)
                .build()
                .inject(this);
    }
}
