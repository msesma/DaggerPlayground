package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityBindingModule;
import eu.sesma.dagger.platform.AndroidApplication;
import eu.sesma.dagger.platform.TestApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        ActivityBindingModule.class,
        TestApplicationModule.class
})
public interface TestApplicationComponent extends ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(AndroidApplication application);

        ApplicationComponent build();
    }
}