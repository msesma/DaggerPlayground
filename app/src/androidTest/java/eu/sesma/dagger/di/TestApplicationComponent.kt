package eu.sesma.dagger.di

import dagger.Component
import eu.sesma.dagger.core.di.CoreComponent

@ApplicationScoped
@Component(
        modules = [TestApplicationModule::class],
        dependencies = [CoreComponent::class])
interface TestApplicationComponent : ApplicationComponent
