package eu.sesma.dagger.di

import eu.sesma.dagger.app_activity.AppActivity
import eu.sesma.dagger.app_activity.AppPresenter
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appActivityModule = module {
    scope(named<AppActivity>()) {
        scoped {
            AppPresenter(
                    appSingletonCollaborator1 = get(),
                    appSingletonCollaborator2 = get()
            )
        }
    }
}
