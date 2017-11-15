package eu.sesma.library;

import javax.inject.Inject;

class LibraryCollaborator {

    @Inject
    public LibraryCollaborator() {

    }

    public String greet() {
        return "-Hello, LibraryMain";
    }
}
