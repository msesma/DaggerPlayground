package eu.sesma.dagger.core.di

import android.content.Context
import dagger.Module
import dagger.Provides


@Module
class CoreModule(val context: Context) {

    @Provides
    fun provideApplicationContext(): Context = context.applicationContext
}