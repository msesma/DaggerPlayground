package eu.sesma.dagger.platform

import dagger.Module
import dagger.Provides
import eu.sesma.dagger.di.ActivityScoped
import eu.sesma.dagger.ui.ActCollaborator
import eu.sesma.dagger.ui.BaseActivity

@Module
class ActivityModule(private val activity: BaseActivity) {

    @Provides
    @ActivityScoped
    fun provideActivity(): BaseActivity {
        return this.activity
    }

    @Provides
    @ActivityScoped
    fun provideActCollaborator(): ActCollaborator {
        return ActCollaborator()
    }
}
