package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityBindingModule;
import eu.sesma.dagger.platform.AndroidApplication;
import eu.sesma.dagger.platform.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        ActivityBindingModule.class,
        ApplicationModule.class
})
public interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(AndroidApplication application);

        ApplicationComponent build();
    }

    ActivityComponent.Builder getActivityComponentBuilder();

}
