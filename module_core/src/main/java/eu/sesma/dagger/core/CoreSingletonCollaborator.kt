package eu.sesma.dagger.core

import javax.inject.Inject
import javax.inject.Singleton

class CoreSingletonCollaborator
@Inject constructor() {

    fun greet(): String {
        return "-Hello, I'm CoreSingletonCollaborator: $this"
    }
}
