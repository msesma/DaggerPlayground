package eu.sesma.dagger.di

import dagger.Component

@ApplicationScoped
@Component(
        modules = [TestApplicationModule::class],
        dependencies = [CoreComponent::class])
interface TestApplicationComponent : ApplicationComponent
