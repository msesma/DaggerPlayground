package eu.sesma.dagger.di

import eu.sesma.dagger.platform.ApplicationModule

import android.content.Context

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    //Exposed to sub-graphs
    fun provideContext(): Context

    fun provideAppCollaborator(): IAppCollaborator
}
