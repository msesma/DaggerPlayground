package eu.sesma.dagger.app_activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import eu.sesma.dagger.R
import org.koin.android.scope.currentScope

class AppActivity : AppCompatActivity() {

    val presenter: AppPresenter by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        presenter.initialize()

        findViewById<TextView>(R.id.text_view_for_test).text = presenter.appSingletonCollaboratorMessage()
    }
}
