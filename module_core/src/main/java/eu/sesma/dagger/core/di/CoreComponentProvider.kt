package eu.sesma.dagger.core.di

import android.content.Context

/**
 * This interface is implemented by {@link AndroidApplication} in order to create the dagger CoreComponent
 * and expose its instances to app module and the rest of the modules (e.g. home, hive...)
 */
interface CoreComponentProvider {
    fun provideCoreComponent(): CoreComponent
}

/**
 * This high level is used to get the core component from app and the rest of the modules to access
 * the instances exposed.
 */
fun getCoreComponent(applicationContext: Context): CoreComponent {
    return if (applicationContext is CoreComponentProvider) {
        (applicationContext as CoreComponentProvider).provideCoreComponent()
    } else {
        throw IllegalStateException("The application context passed does not implement CoreComponentProvider")
    }
}