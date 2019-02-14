package eu.sesma.dagger.ui.main;

import eu.sesma.dagger.ui.IAppCollaborator;
import eu.sesma.dagger.ui.Navigator;

import javax.inject.Inject;

import eu.sesma.core.CoreCollaborator;
import eu.sesma.library.LibraryCollaborator;

public class MainPresenter {

    private final Navigator navigator;
    private final IAppCollaborator appCollaborator;
    private final LibraryCollaborator libraryCollaborator;
    private final CoreCollaborator coreCollaborator;

    @Inject
    public MainPresenter(Navigator navigator,
                         IAppCollaborator appCollaborator,
                         LibraryCollaborator libraryCollaborator,
                         CoreCollaborator coreCollaborator) {
        this.navigator = navigator;
        this.appCollaborator = appCollaborator;
        this.libraryCollaborator = libraryCollaborator;
        this.coreCollaborator =coreCollaborator;
    }

    public void initialize() {

    }

    public void onClick() {
        navigator.navigateToDetail();
    }

    public String getAppCollaboratorVersion() {
        return appCollaborator.getCollaboratorVersion();
    }

    public String getLibraryCollaboratorGreet() {
        return libraryCollaborator.greet();
    }

    public String getCoreCollaboratorGreet() {
        return coreCollaborator.greet();
    }
}
