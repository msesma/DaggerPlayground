package eu.sesma.dagger.app_activity

import android.util.Log
import eu.sesma.dagger.IAppSingletonCollaborator
import javax.inject.Inject

class AppPresenter
@Inject constructor(private val appSingletonCollaborator1: IAppSingletonCollaborator,
                    private val appSingletonCollaborator2: IAppSingletonCollaborator) {

    companion object {
        private val TAG = AppPresenter::class.java.simpleName
    }

    fun initialize() {
        showLogs()
    }

    private fun showLogs() {
        Log.d(TAG, "==> App presenter instances: " +
                " \r\n==> appSingletonCollaborator1: " + appSingletonCollaborator1 +
                " \r\n==> appSingletonCollaborator2: " + appSingletonCollaborator2)
    }

    fun appSingletonCollaboratorMessage() = appSingletonCollaborator1.getMessage()
}
