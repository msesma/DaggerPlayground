package eu.sesma.dagger.di

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.another_activity.AnotherActivity
import eu.sesma.dagger.detail.DetailActivity
import eu.sesma.dagger.main.MainActivityCollaborator
import eu.sesma.dagger.main.MainActivity
import eu.sesma.dagger.platform.ActivityModule

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)

    fun inject(anotherActivity: AnotherActivity)

    //Exposed to sub-graphs.
    fun activity(): AppCompatActivity

    fun provideActCollaborator(): MainActivityCollaborator
}
