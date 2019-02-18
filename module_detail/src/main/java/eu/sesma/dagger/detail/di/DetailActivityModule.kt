package eu.sesma.dagger.detail.di

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides


@Module
class DetailActivityModule(private val activity: AppCompatActivity) {

    @Provides
    fun providesActivity() = activity
}