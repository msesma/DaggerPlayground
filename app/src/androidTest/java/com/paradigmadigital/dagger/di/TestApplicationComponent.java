package com.paradigmadigital.dagger.di;

import com.paradigmadigital.dagger.platform.TestApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = TestApplicationModule.class)
public interface TestApplicationComponent extends ApplicationComponent {
}
