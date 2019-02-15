package eu.sesma.dagger.platform

import android.content.Context
import dagger.Module
import dagger.Provides
import eu.sesma.dagger.ui.AppCollaborator
import eu.sesma.dagger.ui.IAppCollaborator
import javax.inject.Singleton

@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides
    fun provideContext(): Context {
        return this.application
    }

    @Provides
    @Singleton
    fun provideAppCollaborator(): IAppCollaborator {
        return AppCollaborator()
    }
}
