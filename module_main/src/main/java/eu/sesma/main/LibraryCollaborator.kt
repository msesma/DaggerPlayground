package eu.sesma.main

import eu.sesma.core.CoreCollaborator
import javax.inject.Inject

class LibraryCollaborator
@Inject constructor(private val coreCollaborator: CoreCollaborator) {

    fun greet(): String {
        return "-Hello, I'm Library Collaborator and my friend is: \n" + coreCollaborator.greet()
    }
}
