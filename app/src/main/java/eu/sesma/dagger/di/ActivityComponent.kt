package eu.sesma.dagger.di

import eu.sesma.dagger.platform.ActivityModule
import eu.sesma.dagger.ui.ActCollaborator
import eu.sesma.dagger.ui.BaseActivity
import eu.sesma.dagger.ui.another.AnotherActivity
import eu.sesma.dagger.ui.detail.DetailActivity
import eu.sesma.dagger.ui.main.MainActivity

import dagger.Component

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(detailActivity: DetailActivity)

    fun inject(anotherActivity: AnotherActivity)

    //Exposed to sub-graphs.
    fun activity(): BaseActivity

    fun provideActCollaborator(): ActCollaborator
}
