package eu.sesma.dagger.main.di

import android.support.v7.app.AppCompatActivity
import dagger.Component
import eu.sesma.dagger.core.di.ActivityScoped
import eu.sesma.dagger.core.di.CoreComponent
import eu.sesma.dagger.main.MainActivity


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