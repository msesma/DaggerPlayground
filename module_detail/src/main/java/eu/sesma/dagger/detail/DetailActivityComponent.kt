package eu.sesma.dagger.detail

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.core.ActivityScoped
import eu.sesma.dagger.core.CoreComponent


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