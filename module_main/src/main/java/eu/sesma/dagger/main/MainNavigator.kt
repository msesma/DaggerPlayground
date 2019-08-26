package eu.sesma.dagger.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import eu.sesma.dagger.detail.DetailActivity

class MainNavigator
constructor(private val context: Context,
            private val coreCollaborator: CoreCollaborator,
            private val coreSingletonCollaborator: CoreSingletonCollaborator,
            private val mainCollaborator: MainCollaborator,
            private val mainScopedCollaborator: MainScopedCollaborator,
            private val activity: AppCompatActivity) {

    companion object {
        private val TAG = MainNavigator::class.java.simpleName
    }

    fun navigateToDetail() {
        showLogs()
        val intent = Intent(activity, DetailActivity::class.java)
        activity.startActivity(intent)
    }

    private fun showLogs() {
        Log.d(TAG, "==> Main navigator instances: " +
                " \r\n==> Context (App): " + context +
                " \r\n==> Activity: " + activity +
                " \r\n==> CoreCollaborator: " + coreCollaborator +
                " \r\n==> CoreSingletonCollaborator: " + coreSingletonCollaborator +
                " \r\n==> MainCollaborator: " + mainCollaborator +
                " \r\n==> MainScopedCollaborator: " + mainScopedCollaborator)
    }
}
