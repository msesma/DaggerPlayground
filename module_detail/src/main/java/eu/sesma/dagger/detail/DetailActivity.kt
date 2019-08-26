package eu.sesma.dagger.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import eu.sesma.dagger.R
import org.koin.android.scope.currentScope

class DetailActivity : AppCompatActivity() {

    val presenter: DetailPresenter by currentScope.inject()

    private val listener: View.OnClickListener = View.OnClickListener { presenter.onClick() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        presenter.initialize()
        findViewById<Button>(R.id.button).setOnClickListener(listener)
    }
}
