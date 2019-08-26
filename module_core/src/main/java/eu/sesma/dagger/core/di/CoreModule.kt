package eu.sesma.dagger.core.di

import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import org.koin.dsl.module

val coreModule = module {

    single { CoreSingletonCollaborator() }

    factory { CoreCollaborator() }
}