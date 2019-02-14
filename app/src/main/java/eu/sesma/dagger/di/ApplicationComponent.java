package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityBindingModule;
import eu.sesma.dagger.platform.AndroidApplication;
import eu.sesma.dagger.platform.ApplicationModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
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

    void inject(AndroidApplication androidApplication);
}
