package eu.sesma.dagger.main

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import org.junit.Before
import org.junit.Test

class MainPresenterShould {

    private val navigator: MainNavigator = mock()
    private val mainCollaborator: MainCollaborator = mock()
    private val mainScopedCollaborator: MainScopedCollaborator = mock()
    private val coreSingletonCollaborator: CoreSingletonCollaborator = mock()
    private val coreCollaborator: CoreCollaborator = mock()

    private lateinit var presenter: MainPresenter

    @Before
    fun setup() {
        presenter = MainPresenter(navigator, mainCollaborator, mainScopedCollaborator, coreSingletonCollaborator, coreCollaborator)
    }

    @Test
    fun navigateToDetailOnClick() {

        presenter.onClick()

        verify(navigator).navigateToDetail()
    }
}