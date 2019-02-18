package eu.sesma.dagger

import android.app.Application
import eu.sesma.dagger.core.di.CoreComponent
import eu.sesma.dagger.core.di.CoreComponentProvider
import eu.sesma.dagger.core.di.CoreModule
import eu.sesma.dagger.core.di.DaggerCoreComponent
import eu.sesma.dagger.di.ApplicationComponent
import eu.sesma.dagger.di.ApplicationModule
import eu.sesma.dagger.di.DaggerApplicationComponent

open class AndroidApplication : Application(), CoreComponentProvider {

    protected open val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.builder()
                .coreModule(CoreModule(this@AndroidApplication))
                .build()
    }

    override fun provideCoreComponent() = coreComponent

    open val applicationComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .coreComponent(coreComponent)
                .build()
    }
}
