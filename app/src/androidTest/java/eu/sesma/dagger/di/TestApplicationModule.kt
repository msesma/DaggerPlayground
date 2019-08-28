package eu.sesma.dagger.di


import eu.sesma.dagger.IAppSingletonCollaborator
import eu.sesma.dagger.TestAppSingletonCollaborator
import org.koin.dsl.module

val testApplicationModule = module {

    single<IAppSingletonCollaborator> { TestAppSingletonCollaborator() }

}
