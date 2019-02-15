package eu.sesma.dagger.ui.main

import eu.sesma.dagger.ui.IAppCollaborator
import eu.sesma.dagger.ui.Navigator

import javax.inject.Inject

import eu.sesma.core.CoreCollaborator
import eu.sesma.main.LibraryCollaborator

class MainPresenter
@Inject constructor(private val navigator: Navigator,
            private val appCollaborator: IAppCollaborator,
            private val libraryCollaborator: LibraryCollaborator,
            private val coreCollaborator: CoreCollaborator) {

    val appCollaboratorVersion: String
        get() = appCollaborator.collaboratorVersion

    val libraryCollaboratorGreet: String
        get() = libraryCollaborator.greet()

    val coreCollaboratorGreet: String
        get() = coreCollaborator.greet()

    fun initialize() {

    }

    fun onClick() {
        navigator.navigateToDetail()
    }
}
