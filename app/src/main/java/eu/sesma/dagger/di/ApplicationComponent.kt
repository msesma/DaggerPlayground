package eu.sesma.dagger.di

import android.app.Application
import dagger.Component
import eu.sesma.dagger.IAppSingletonCollaborator
import eu.sesma.dagger.core.di.CoreComponent

@ApplicationScoped
@Component(
        modules = [ApplicationModule::class],
        dependencies = [CoreComponent::class])
interface ApplicationComponent {

    //Exposed to sub-graphs
    fun provideContext(): Application

    fun appSingletonCollaborator(): IAppSingletonCollaborator

}
