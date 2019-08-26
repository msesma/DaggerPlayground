package eu.sesma.dagger.main

import eu.sesma.dagger.core.di.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class MainScopedCollaborator
@Inject constructor() {

    fun greet(): String {
        return "-Hello, I'm MainScopedCollaborator: $this"
    }
}

