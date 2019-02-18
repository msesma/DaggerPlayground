package eu.sesma.dagger.detail.di

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.core.di.ActivityScoped
import eu.sesma.dagger.core.di.CoreComponent
import eu.sesma.dagger.detail.DetailActivity


@ActivityScoped
@Component(
        dependencies = [CoreComponent::class],
        modules = [DetailActivityModule::class]
)
interface DetailActivityComponent {

    fun inject(activity: DetailActivity)

    //Exposed to sub-graphs.
    fun activity(): AppCompatActivity
}