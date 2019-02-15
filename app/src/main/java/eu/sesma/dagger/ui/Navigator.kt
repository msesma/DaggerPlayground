package eu.sesma.dagger.ui

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.util.Log
import eu.sesma.dagger.ui.another.AnotherActivity
import eu.sesma.dagger.ui.detail.DetailActivity
import javax.inject.Inject

class Navigator @Inject
constructor(private val context: Context,
            private val appColaborator: IAppCollaborator,
            private val actColaborator: ActCollaborator,
            private val activity: AppCompatActivity) {

    companion object {
        private val TAG = Navigator::class.java.simpleName
    }

    fun navigateToDetail() {
        showLogs()
        val intent = Intent(activity, DetailActivity::class.java)
        activity.startActivity(intent)
    }

    fun navigateToAnother() {
        showLogs()
        val intent = Intent(activity, AnotherActivity::class.java)
        activity.startActivity(intent)
    }

    private fun showLogs() {
        Log.d(TAG, "Context (App): " + context +
                " \r\nActivity: " + activity +
                " \r\nAppCollaborator: " + appColaborator +
                " \r\nActCollaborator: " + actColaborator)
    }
}
