package eu.sesma.dagger.core.di

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


interface ActivityProvider {

    val activeActivity: AppCompatActivity

    fun activityProvider()

    interface ActivityProviderCallbacks : Application.ActivityLifecycleCallbacks {
        override fun onActivityStarted(activity: Activity?) {}

        override fun onActivityDestroyed(activity: Activity?) {}

        override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}

        override fun onActivityStopped(activity: Activity?) {}

        override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {}

        override fun onActivityPaused(activity: Activity?) {}

        override fun onActivityResumed(activity: Activity?) {}
    }
}

