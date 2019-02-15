package eu.sesma.main

import javax.inject.Singleton

import dagger.Component

@Singleton
@Component
interface LibraryComponent {

    fun inject(libraryMain: LibraryMain)

}
