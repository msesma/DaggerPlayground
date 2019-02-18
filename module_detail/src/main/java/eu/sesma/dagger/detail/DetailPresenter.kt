package eu.sesma.dagger.detail

import android.util.Log
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import javax.inject.Inject

class DetailPresenter
@Inject constructor(private val navigator: DetailNavigator,
                    private val coreSingletonCollaborator: CoreSingletonCollaborator,
                    private val coreCollaborator: CoreCollaborator) {

    companion object {
        private val TAG = DetailPresenter::class.java.simpleName
    }

    fun initialize() {
    }

    fun onClick() {
        showLogs()
        navigator.navigateToAnother()
    }

    private fun showLogs() {
        Log.d(TAG, "CoreCollaborator: " + coreCollaborator +
                " \r\nCoreSingletonCollaborator: " + coreSingletonCollaborator)
    }
}
