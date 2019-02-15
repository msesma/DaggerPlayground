package eu.sesma.main

import android.util.Log

import javax.inject.Inject

class LibraryMain {

    companion object {
        private val TAG = LibraryMain::class.java.getSimpleName()
    }

    @Inject
    lateinit var collaborator: LibraryCollaborator

    fun initialize() {

        DaggerLibraryComponent.create().inject(this)

        Log.d(TAG, "Hello collaborator " + collaborator.greet())
    }
}
