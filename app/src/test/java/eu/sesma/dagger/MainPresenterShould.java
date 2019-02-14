package eu.sesma.dagger;

import eu.sesma.dagger.ui.IAppCollaborator;
import eu.sesma.dagger.ui.Navigator;
import eu.sesma.dagger.ui.main.MainPresenter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainPresenterShould {

    @Mock
    Navigator navigator;
    @Mock
    IAppCollaborator collaborator;

    private MainPresenter presenter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        presenter = new MainPresenter(navigator, collaborator);
    }

    @Test
    public void getVersionFromCollaboratorWhengetCollaboratorVersion() {
        when(collaborator.getCollaboratorVersion()).thenReturn("version");

        String version = presenter.getAppCollaboratorVersion();

        assertThat(version).isEqualTo("version");
    }

    @Test
    public void navigateToDetailOnClick() {

        presenter.onClick();

        verify(navigator).navigateToDetail();
    }
}