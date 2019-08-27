package eu.sesma.dagger

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import eu.sesma.dagger.core.di.ActivityProvider
import eu.sesma.dagger.core.di.coreModule
import eu.sesma.dagger.detail.DetailActivity
import eu.sesma.dagger.detail.di.detailActivityModule
import eu.sesma.dagger.di.appActivityModule
import eu.sesma.dagger.di.appModule
import eu.sesma.dagger.main.di.mainActivityModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

open class AndroidApplication : Application(), ActivityProvider {

    override var activeActivity: AppCompatActivity = AppCompatActivity()

    override fun onCreate() {
        super.onCreate()

        activityProvider()

        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@AndroidApplication)
            modules(listOf(appModule, coreModule, mainActivityModule, detailActivityModule, appActivityModule))
        }
    }

    private fun activityProvider() {
        registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
            override fun onActivityStarted(activity: Activity?) {}

            override fun onActivityDestroyed(activity: Activity?) {}

            override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}

            override fun onActivityStopped(activity: Activity?) {}

            override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
                activeActivity = activity as AppCompatActivity
            }

            override fun onActivityPaused(activity: Activity?) {}

            override fun onActivityResumed(activity: Activity?) {}
        })
    }
}
