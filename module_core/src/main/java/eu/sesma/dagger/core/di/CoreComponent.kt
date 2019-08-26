package eu.sesma.dagger.core.di

import android.content.Context
import dagger.Component
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import javax.inject.Singleton


/**
 * This component exposes core module instances. Components depending on CoreComponent could access to them
 */

@Component(modules = [
    CoreModule::class,
    CollaboratorModule::class
])
@Singleton
interface CoreComponent {

    fun applicationContext(): Context

    fun coreCollaborator(): CoreCollaborator

    fun coreSingletonCollaborator(): CoreSingletonCollaborator

}