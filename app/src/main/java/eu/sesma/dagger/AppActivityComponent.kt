package eu.sesma.dagger

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.core.ActivityScoped
import eu.sesma.dagger.app_activity.AppActivity
import eu.sesma.dagger.main.MainCollaborator

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class], modules = [AppActivityModule::class])
interface AppActivityComponent {

    fun inject(anotherActivity: AppActivity)

    //Exposed to sub-graphs.
    fun activity(): AppCompatActivity

    fun provideActCollaborator(): MainCollaborator
}
