package eu.sesma.dagger

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import eu.sesma.dagger.core.ActivityScoped

@Module
class AppActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityScoped
    fun provideActivity(): AppCompatActivity {
        return this.activity
    }
}
