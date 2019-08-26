package eu.sesma.dagger.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import eu.sesma.dagger.R
import eu.sesma.dagger.core.di.getCoreComponent
import eu.sesma.dagger.main.di.DaggerMainActivityComponent
import eu.sesma.dagger.main.di.MainActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    private val listener: View.OnClickListener = View.OnClickListener { presenter.onClick() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainActivityComponent.builder()
                .mainActivityModule(MainActivityModule(this))
                .coreComponent(getCoreComponent(applicationContext))
                .build()
                .inject(this)

        presenter.initialize()

        findViewById<View>(R.id.button).setOnClickListener(listener)

        findViewById<TextView>(R.id.textView1).text = presenter.coreCollaboratorGreet

        findViewById<TextView>(R.id.textView2).text = presenter.coreSingletonCollaboratorGreet

        findViewById<TextView>(R.id.textView3).text = presenter.mainActivityCollaboratorGreet

        findViewById<TextView>(R.id.textView4).text = presenter.mainActivityScopedCollaboratorGreet
    }
}
