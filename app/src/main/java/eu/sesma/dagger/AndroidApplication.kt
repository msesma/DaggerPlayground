package eu.sesma.dagger

import android.app.Application
import eu.sesma.dagger.core.*
import eu.sesma.dagger.DaggerApplicationComponent

open class AndroidApplication : Application(), CoreComponentProvider {

    //TODO Explain why coremodule has to be set but collaboratorModule dont
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
