package eu.sesma.dagger.core

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class CollaboratorModule() {

    @Provides
    fun provideCoreCollaborator(): CoreCollaborator = CoreCollaborator()

    @Provides
    @Singleton
    fun provideCoreSingletonCollaborator(): CoreSingletonCollaborator = CoreSingletonCollaborator()
}