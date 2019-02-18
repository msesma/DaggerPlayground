package eu.sesma.dagger.core

import android.content.Context
import dagger.Component
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