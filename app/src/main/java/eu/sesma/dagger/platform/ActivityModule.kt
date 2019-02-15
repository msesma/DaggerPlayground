package eu.sesma.dagger.platform

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import eu.sesma.dagger.di.ActivityScoped
import eu.sesma.main.ActCollaborator

@Module
class ActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @ActivityScoped
    fun provideActivity(): AppCompatActivity {
        return this.activity
    }

    @Provides
    @ActivityScoped
    fun provideActCollaborator(): ActCollaborator {
        return ActCollaborator()
    }
}
