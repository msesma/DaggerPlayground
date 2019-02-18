package eu.sesma.dagger

import eu.sesma.dagger.di.ApplicationComponent
import eu.sesma.dagger.di.ApplicationModule
import eu.sesma.dagger.di.DaggerTestApplicationComponent
import eu.sesma.dagger.di.TestApplicationModule

class TestAndroidApplication : AndroidApplication() {

    override val applicationComponent: ApplicationComponent by lazy {
        DaggerTestApplicationComponent.builder()
                .testApplicationModule(TestApplicationModule(this))
                .coreComponent(coreComponent)
                .build()
    }
}
