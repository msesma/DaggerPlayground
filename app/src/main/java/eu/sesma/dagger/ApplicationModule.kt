package eu.sesma.dagger

import android.app.Application
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides
    fun provideContext(): Application {
        return this.application
    }

//    @Provides
//    @Singleton
//    fun provideAppCollaborator(): IAppCollaborator {
//        return AppCollaborator()
//    }
}
