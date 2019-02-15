package eu.sesma.core

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CoreSingletonCollaborator
@Inject constructor() {

    fun greet(): String {
        return "-Hello, I'm CoreSingletonCollaborator"
    }
}
