package eu.sesma.dagger.core.di

import android.support.v7.app.AppCompatActivity


interface ActivityProvider {

    val activeActivity: AppCompatActivity
}