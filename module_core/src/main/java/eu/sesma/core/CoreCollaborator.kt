package eu.sesma.core

import javax.inject.Inject

class CoreCollaborator
@Inject constructor() {

    fun greet(): String {
        return "-Hello, I'm CoreCollaborator"
    }
}
