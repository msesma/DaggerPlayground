package eu.sesma.dagger.detail.di

import eu.sesma.dagger.core.di.ActivityProvider
import eu.sesma.dagger.detail.DetailActivity
import eu.sesma.dagger.detail.DetailNavigator
import eu.sesma.dagger.detail.DetailPresenter
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module


val detailActivityModule = module {
    scope(named<DetailActivity>()) {
        scoped {
            DetailNavigator(
                    context = androidContext(),
                    coreCollaborator = get(),
                    activity = (androidContext() as ActivityProvider).activeActivity
            )
        }

        scoped {
            DetailPresenter(
                    navigator = get(),
                    coreSingletonCollaborator = get(),
                    coreCollaborator = get()
            )
        }
    }
}