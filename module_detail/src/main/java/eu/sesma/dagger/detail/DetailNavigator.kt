package eu.sesma.dagger.detail

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import eu.sesma.core.CoreCollaborator
import javax.inject.Inject

class DetailNavigator @Inject
constructor(private val context: Context,
            private val coreCollaborator: CoreCollaborator,
            private val activity: AppCompatActivity) {

    companion object {
        private val TAG = DetailNavigator::class.java.simpleName
    }

    fun navigateToAnother() {
        showLogs()
        val intent = Intent(activity, AnotherActivity::class.java)
        activity.startActivity(intent)
    }

    private fun showLogs() {
        Log.d(TAG, "Context (App): " + context +
                " \r\nActivity: " + activity +
                " \r\nCoreCollaborator: " + coreCollaborator)
    }
}
