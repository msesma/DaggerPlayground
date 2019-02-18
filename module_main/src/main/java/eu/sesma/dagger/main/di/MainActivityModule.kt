package eu.sesma.dagger.main.di

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides


@Module
class MainActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun providesActivity() = activity
}