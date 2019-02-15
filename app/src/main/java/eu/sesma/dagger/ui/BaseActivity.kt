package eu.sesma.dagger.ui

import eu.sesma.dagger.di.ActivityComponent
import eu.sesma.dagger.di.ApplicationComponent
import eu.sesma.dagger.di.DaggerActivityComponent
import eu.sesma.dagger.platform.ActivityModule
import eu.sesma.dagger.platform.AndroidApplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    protected var activityComponent: ActivityComponent? = null
        private set

    private val applicationComponent: ApplicationComponent
        get() = (application as AndroidApplication).applicationComponent

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.activityComponent = DaggerActivityComponent.builder()
                .applicationComponent(applicationComponent)
                .activityModule(ActivityModule(this))
                .build()
    }
}
