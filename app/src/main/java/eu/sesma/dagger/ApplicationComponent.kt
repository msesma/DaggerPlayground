package eu.sesma.dagger

import android.app.Application
import dagger.Component
import eu.sesma.dagger.core.CoreComponent

@ApplicationScoped
@Component(
        modules = [ApplicationModule::class],
        dependencies = [CoreComponent::class])
interface ApplicationComponent {

    //Exposed to sub-graphs
    fun provideContext(): Application

}
