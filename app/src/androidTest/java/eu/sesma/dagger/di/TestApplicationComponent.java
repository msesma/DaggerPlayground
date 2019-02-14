package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.TestApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = TestApplicationModule.class)
public interface TestApplicationComponent extends ApplicationComponent {
}
