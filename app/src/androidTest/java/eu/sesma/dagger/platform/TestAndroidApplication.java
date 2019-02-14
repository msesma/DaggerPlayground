package eu.sesma.dagger.platform;

import eu.sesma.dagger.di.ApplicationComponent;
import eu.sesma.dagger.di.DaggerTestApplicationComponent;

public class TestAndroidApplication extends AndroidApplication {
    @Override
    protected ApplicationComponent createComponent() {
        return DaggerTestApplicationComponent.builder()
                .testApplicationModule(new TestApplicationModule(this))
                .build();
    }
}
