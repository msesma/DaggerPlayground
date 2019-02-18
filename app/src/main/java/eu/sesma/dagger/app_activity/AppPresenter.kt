package eu.sesma.dagger.app_activity

import android.util.Log
import eu.sesma.dagger.AppSingletonCollaborator
import javax.inject.Inject

class AppPresenter
@Inject constructor(val appSingletonCollaborator1: AppSingletonCollaborator,
                    val appSingletonCollaborator2: AppSingletonCollaborator) {

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
}
