package eu.sesma.library;

import javax.inject.Inject;

import eu.sesma.core.CoreCollaborator;

public class LibraryCollaborator {

    private final CoreCollaborator coreCollaborator;

    @Inject
    public LibraryCollaborator(CoreCollaborator coreCollaborator) {
        this.coreCollaborator = coreCollaborator;
    }

    public String greet() {
        return "-Hello, I'm Library Collaborator and my friend is: \n" + coreCollaborator.greet();
    }
}
