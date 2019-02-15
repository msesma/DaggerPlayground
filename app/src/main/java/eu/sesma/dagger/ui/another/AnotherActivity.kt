package eu.sesma.dagger.ui.another

import android.os.Bundle
import eu.sesma.dagger.R
import eu.sesma.dagger.ui.BaseActivity
import eu.sesma.dagger.ui.detail.DetailPresenter
import javax.inject.Inject

class AnotherActivity : BaseActivity() {

    @Inject
    lateinit var presenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        activityComponent?.inject(this)

        presenter.initialize()
    }
}
