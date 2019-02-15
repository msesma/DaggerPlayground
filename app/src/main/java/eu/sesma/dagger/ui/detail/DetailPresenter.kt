package eu.sesma.dagger.ui.detail

import android.util.Log
import eu.sesma.dagger.ui.ActCollaborator
import eu.sesma.dagger.ui.Navigator
import javax.inject.Inject

class DetailPresenter
@Inject constructor(private val navigator: Navigator, private val actColaborator: ActCollaborator) {

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
        Log.d(TAG, "ActCollaborator: $actColaborator")
    }
}
