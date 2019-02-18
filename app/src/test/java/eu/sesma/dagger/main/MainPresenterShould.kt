package eu.sesma.dagger.main

import eu.sesma.dagger.core.CoreCollaborator

class MainPresenterShould {

    private val navigator: MainNavigator = mock()
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

        verify<MainNavigator>(navigator).navigateToDetail()
    }
}