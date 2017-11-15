package eu.sesma.library;

import android.util.Log;

import javax.inject.Inject;

public class LibraryMain {

    private final static String TAG = LibraryMain.class.getSimpleName();

    @Inject
    LibraryCollaborator collaborator;


    public void initialize() {

        DaggerLibraryComponent.create().inject(this);

        Log.d(TAG, "Hello collaborator " + collaborator.greet());
    }

}
