package eu.sesma.dagger.main

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.core.ActivityScoped
import eu.sesma.dagger.core.CoreComponent


@ActivityScoped
@Component(
        dependencies = [CoreComponent::class],
        modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    fun inject(activity: MainActivity)

    //Exposed to sub-graphs.
    fun activity(): AppCompatActivity
}