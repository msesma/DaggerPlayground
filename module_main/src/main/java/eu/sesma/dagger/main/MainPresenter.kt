package eu.sesma.dagger.main

import android.util.Log
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator

class MainPresenter
constructor(private val navigator: MainNavigator,
            private val mainCollaborator: MainCollaborator,
            private val mainScopedCollaborator: MainScopedCollaborator,
            private val coreSingletonCollaborator: CoreSingletonCollaborator,
            private val coreCollaborator: CoreCollaborator) {

    companion object {
        private val TAG = MainPresenter::class.java.simpleName
    }

    val coreCollaboratorGreet = coreCollaborator.greet()
    val coreSingletonCollaboratorGreet = coreSingletonCollaborator.greet()
    val mainActivityCollaboratorGreet = mainCollaborator.greet()
    val mainActivityScopedCollaboratorGreet = mainScopedCollaborator.greet()

    fun initialize() {
        showLogs()
    }

    fun onClick() {
        navigator.navigateToDetail()
    }

    private fun showLogs() {
        Log.d(TAG, "==> Main presenter instances: " +
                " \r\n==> CoreCollaborator: " + coreCollaborator +
                " \r\n==> CoreSingletonCollaborator: " + coreSingletonCollaborator +
                " \r\n==> MainCollaborator: " + mainCollaborator +
                " \r\n==> MainScopedCollaborator: " + mainScopedCollaborator)
    }
}
