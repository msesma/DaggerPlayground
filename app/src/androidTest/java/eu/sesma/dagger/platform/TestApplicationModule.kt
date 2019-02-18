package eu.sesma.dagger.platform

import eu.sesma.dagger.ui.TestAppCollaborator

import android.content.Context

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import eu.sesma.dagger.AndroidApplication

@Module
class TestApplicationModule(private val application: AndroidApplication) {

    @Provides
    fun provideContext(): Context {
        return this.application
    }

    @Provides
    @Singleton
    fun provideAppCollaborator(): IAppCollaborator {
        return TestAppCollaborator()
    }
}
