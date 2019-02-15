package eu.sesma.dagger

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import eu.sesma.core.CoreCollaborator
import eu.sesma.dagger.ui.IAppCollaborator
import eu.sesma.dagger.ui.Navigator
import eu.sesma.dagger.ui.main.MainPresenter
import eu.sesma.main.LibraryCollaborator
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class MainPresenterShould {

    private val navigator: Navigator = mock()
    private val collaborator: IAppCollaborator = mock()
    private val libraryCollaborator: LibraryCollaborator = mock()
    private val coreCollaborator: CoreCollaborator = mock()

    private lateinit var presenter: MainPresenter

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        presenter = MainPresenter(navigator, collaborator, libraryCollaborator, coreCollaborator)
    }

    @Test
    fun `get Version From Collaborator When getCollaboratorVersion`() {
        whenever(collaborator.collaboratorVersion).thenReturn("version")

        val version = presenter.appCollaboratorVersion

        assertEquals("version", version)
    }

    @Test
    fun navigateToDetailOnClick() {

        presenter.onClick()

        verify<Navigator>(navigator).navigateToDetail()
    }
}