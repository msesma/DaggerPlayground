package eu.sesma.dagger.platform

import eu.sesma.dagger.AndroidApplication
import eu.sesma.dagger.di.ApplicationComponent
import eu.sesma.dagger.di.DaggerTestApplicationComponent

class TestAndroidApplication : AndroidApplication() {
    override fun createComponent(): ApplicationComponent {
        return DaggerTestApplicationComponent.builder()
                .testApplicationModule(TestApplicationModule(this))
                .build()
    }
}
