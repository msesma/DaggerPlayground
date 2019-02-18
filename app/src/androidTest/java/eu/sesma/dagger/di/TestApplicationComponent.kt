package eu.sesma.dagger.di

import eu.sesma.dagger.platform.TestApplicationModule

import javax.inject.Singleton

import dagger.Component
import eu.sesma.dagger.ApplicationComponent

@Singleton
@Component(modules = [TestApplicationModule::class])
interface TestApplicationComponent : ApplicationComponent
