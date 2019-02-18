package eu.sesma.dagger.core.di

import dagger.Module
import dagger.Provides
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import javax.inject.Singleton


@Module
class CollaboratorModule() {

    @Provides
    fun provideCoreCollaborator(): CoreCollaborator = CoreCollaborator()

    @Provides
    @Singleton
    fun provideCoreSingletonCollaborator(): CoreSingletonCollaborator = CoreSingletonCollaborator()
}