package eu.sesma.dagger.di

import android.app.Application
import dagger.Module
import dagger.Provides
import eu.sesma.dagger.AndroidApplication
import eu.sesma.dagger.AppSingletonCollaborator
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides
    @ApplicationScoped
    fun provideContext(): Application = application

    @Provides
    @ApplicationScoped //TODO Exercise change by a singleton
    fun provideAppCollaborator(): AppSingletonCollaborator = AppSingletonCollaborator()
}
