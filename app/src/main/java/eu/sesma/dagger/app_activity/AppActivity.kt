package eu.sesma.dagger.app_activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import eu.sesma.dagger.AndroidApplication
import eu.sesma.dagger.R
import eu.sesma.dagger.di.AppActivityModule
import eu.sesma.dagger.di.DaggerAppActivityComponent
import javax.inject.Inject

class AppActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: AppPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)

        DaggerAppActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).applicationComponent)
                .appActivityModule(AppActivityModule(this))
                .build()
                .inject(this)

        presenter.initialize()

        findViewById<TextView>(R.id.text_view_for_test).text = presenter.appSingletonCollaboratorMessage()
    }
}
