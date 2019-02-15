package eu.sesma.dagger.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import eu.sesma.dagger.R
import eu.sesma.dagger.di.DaggerActivityComponent
import eu.sesma.dagger.platform.ActivityModule
import eu.sesma.dagger.platform.AndroidApplication
import eu.sesma.main.LibraryMain
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    private val listener: View.OnClickListener = View.OnClickListener { presenter.onClick() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).applicationComponent)
                .activityModule(ActivityModule(this))
                .build().inject(this)


        presenter.initialize()
        title = presenter.appCollaboratorVersion
        (findViewById<View>(R.id.button) as Button).setOnClickListener(listener)

        val libraryMain = LibraryMain()
        libraryMain.initialize()

        findViewById<TextView>(R.id.textView2).text = presenter.libraryCollaboratorGreet

        findViewById<TextView>(R.id.textView3).text = presenter.coreCollaboratorGreet
    }
}
