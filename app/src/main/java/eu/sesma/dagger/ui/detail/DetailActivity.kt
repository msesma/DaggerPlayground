package eu.sesma.dagger.ui.detail

import eu.sesma.dagger.R
import eu.sesma.dagger.ui.BaseActivity

import android.os.Bundle
import android.view.View
import android.widget.Button

import javax.inject.Inject

class DetailActivity : BaseActivity() {

    @Inject
    lateinit var presenter: DetailPresenter

    private val listener: View.OnClickListener = View.OnClickListener { presenter.onClick() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        activityComponent?.inject(this)

        presenter.initialize()
        (findViewById<View>(R.id.button) as Button).setOnClickListener(listener)
    }
}
