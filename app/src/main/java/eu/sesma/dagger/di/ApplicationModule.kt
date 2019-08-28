package eu.sesma.dagger.di

import eu.sesma.dagger.AppSingletonCollaborator
import eu.sesma.dagger.IAppSingletonCollaborator
import eu.sesma.dagger.core.CoreCollaborator
import org.koin.dsl.module

val applicationModule = module {

    single<IAppSingletonCollaborator> { AppSingletonCollaborator() }

}