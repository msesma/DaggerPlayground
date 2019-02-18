package eu.sesma.dagger.main

import eu.sesma.dagger.core.ActivityScoped
import javax.inject.Inject

class MainCollaborator
@Inject constructor() {

    fun greet(): String {
        return "-Hello, I'm MainCollaborator: $this"
    }
}

