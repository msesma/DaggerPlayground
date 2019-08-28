package eu.sesma.dagger

import eu.sesma.dagger.core.di.coreModule
import eu.sesma.dagger.detail.di.detailActivityModule
import eu.sesma.dagger.di.appActivityModule
import eu.sesma.dagger.di.testApplicationModule
import eu.sesma.dagger.main.di.mainActivityModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class TestAndroidApplication : AndroidApplication() {

    override fun initKoin() {
        startKoin {
            androidLogger()
            androidContext(this@TestAndroidApplication)
            modules(listOf(testApplicationModule, coreModule, mainActivityModule, detailActivityModule, appActivityModule))
        }
    }
}
