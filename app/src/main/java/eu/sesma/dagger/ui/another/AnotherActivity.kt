package eu.sesma.dagger.ui.another

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import eu.sesma.dagger.R
import eu.sesma.dagger.di.DaggerActivityComponent
import eu.sesma.dagger.platform.ActivityModule
import eu.sesma.dagger.platform.AndroidApplication
import eu.sesma.dagger.ui.detail.DetailPresenter
import javax.inject.Inject

class AnotherActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        DaggerActivityComponent.builder()
                .applicationComponent((application as AndroidApplication).applicationComponent)
                .activityModule(ActivityModule(this))
                .build().inject(this)

        presenter.initialize()
    }
}
