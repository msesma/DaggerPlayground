package eu.sesma.dagger.di

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.AppSingletonCollaborator
import eu.sesma.dagger.core.di.ActivityScoped
import eu.sesma.dagger.app_activity.AppActivity

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class], modules = [AppActivityModule::class])
interface AppActivityComponent {

    fun inject(anotherActivity: AppActivity)

    //Exposed to sub-graphs.
    fun activity(): AppCompatActivity

}
