package eu.sesma.core;

import javax.inject.Inject;

public class CoreCollaborator {

    @Inject
    public CoreCollaborator() {

    }

    public String greet() {
        return "-Hello, I'm CoreCollaborator";
    }
}
