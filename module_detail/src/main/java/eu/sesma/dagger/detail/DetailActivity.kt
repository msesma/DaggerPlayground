package eu.sesma.dagger.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import eu.sesma.dagger.core.getCoreComponent
import eu.sesma.dagger.R
import javax.inject.Inject

class DetailActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: DetailPresenter

    private val listener: View.OnClickListener = View.OnClickListener { presenter.onClick() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        DaggerDetailActivityComponent.builder()
                .detailActivityModule(DetailActivityModule(this))
                .coreComponent(getCoreComponent(applicationContext))
                .build()
                .inject(this)

        presenter.initialize()
        findViewById<Button>(R.id.button).setOnClickListener(listener)
    }
}
