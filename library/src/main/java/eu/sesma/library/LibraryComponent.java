package eu.sesma.library;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component
public interface LibraryComponent {

    void inject(LibraryMain libraryMain);

}
