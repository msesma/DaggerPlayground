package eu.sesma.dagger.main

import eu.sesma.core.CoreCollaborator
import eu.sesma.core.CoreSingletonCollaborator
import javax.inject.Inject

class MainPresenter
@Inject constructor(private val navigator: MainNavigator,
                    private val mainActivityCollaborator: MainActivityCollaborator,
                    private val coreSingletonCollaborator: CoreSingletonCollaborator,
                    private val coreCollaborator: CoreCollaborator) {

    val coreCollaboratorGreet: String
        get() = coreCollaborator.greet()

    val coreSingletonCollaboratorGreet: String
        get() = coreSingletonCollaborator.greet()

    val mainActivityCollaboratorGreet: String
        get() = mainActivityCollaborator.greet()

    fun initialize() {

    }

    fun onClick() {
        navigator.navigateToDetail()
    }
}
