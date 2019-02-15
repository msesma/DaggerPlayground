package eu.sesma.dagger.platform

import eu.sesma.dagger.di.ApplicationComponent
import eu.sesma.dagger.di.DaggerApplicationComponent

import android.app.Application

open class AndroidApplication : Application() {

    val applicationComponent = createComponent()

    protected open fun createComponent(): ApplicationComponent {
        return DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}
