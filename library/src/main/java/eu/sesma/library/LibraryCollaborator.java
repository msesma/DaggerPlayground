package eu.sesma.library;

import javax.inject.Inject;

public class LibraryCollaborator {

    @Inject
    public LibraryCollaborator() {

    }

    public String greet() {
        return "-Hello, I'm Library Collaborator";
    }
}
