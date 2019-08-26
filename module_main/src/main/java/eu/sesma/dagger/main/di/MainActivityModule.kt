package eu.sesma.dagger.main.di

import eu.sesma.dagger.core.di.ActivityProvider
import eu.sesma.dagger.main.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module

val mainActivityModule = module {
    scope(named<MainActivity>()) {

        factory { MainCollaborator() }

        scoped { MainScopedCollaborator() }

        scoped {
            MainNavigator(
                    context = androidContext(),
                    coreCollaborator = get(),
                    coreSingletonCollaborator = get(),
                    mainCollaborator = get(),
                    mainScopedCollaborator = get(),
                    activity = (androidContext() as ActivityProvider).activeActivity
            )
        }

        scoped {
            MainPresenter(
                    navigator = get(),
                    mainCollaborator = get(),
                    mainScopedCollaborator = get(),
                    coreSingletonCollaborator = get(),
                    coreCollaborator = get()
            )
        }
    }
}