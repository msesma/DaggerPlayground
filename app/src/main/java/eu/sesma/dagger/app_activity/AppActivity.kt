package eu.sesma.dagger.app_activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import eu.sesma.dagger.R
import eu.sesma.dagger.DaggerAppActivityComponent
import eu.sesma.dagger.AppActivityModule
import eu.sesma.dagger.AndroidApplication
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
    }
}
