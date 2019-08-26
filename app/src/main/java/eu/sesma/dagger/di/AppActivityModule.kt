package eu.sesma.dagger.di

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import eu.sesma.dagger.core.di.ActivityScoped

@Module
class AppActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityScoped
    fun provideActivity(): AppCompatActivity {
        return this.activity
    }
}
