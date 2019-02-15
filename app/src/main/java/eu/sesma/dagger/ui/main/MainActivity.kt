package eu.sesma.dagger.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import eu.sesma.dagger.R
import eu.sesma.dagger.ui.BaseActivity
import eu.sesma.main.LibraryMain
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    private val listener: View.OnClickListener = View.OnClickListener { presenter.onClick() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent?.inject(this)

        presenter.initialize()
        title = presenter.appCollaboratorVersion
        (findViewById<View>(R.id.button) as Button).setOnClickListener(listener)

        val libraryMain = LibraryMain()
        libraryMain.initialize()

        (findViewById<View>(R.id.textView2) as TextView).text = presenter.libraryCollaboratorGreet

        (findViewById<View>(R.id.textView3) as TextView).text = presenter.coreCollaboratorGreet
    }
}
