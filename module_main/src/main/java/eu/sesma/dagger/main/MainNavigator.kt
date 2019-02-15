package eu.sesma.dagger.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import eu.sesma.core.CoreCollaborator
import eu.sesma.dagger.detail.DetailActivity
import javax.inject.Inject

class MainNavigator @Inject
constructor(private val context: Context,
            private val coreCollaborator: CoreCollaborator,
            private val mainActivityCollaborator: MainActivityCollaborator,
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
        Log.d(TAG, "Context (App): " + context +
                " \r\nActivity: " + activity +
                " \r\nCoreCollaborator: " + coreCollaborator +
                " \r\nMainActivityCollaborator: " + mainActivityCollaborator)
    }
}
