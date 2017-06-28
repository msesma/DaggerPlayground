package com.paradigmadigital.dagger.ui.main;

import com.paradigmadigital.dagger.ui.IAppCollaborator;
import com.paradigmadigital.dagger.ui.Navigator;

import javax.inject.Inject;

public class MainPresenter {

    private final Navigator navigator;
    private final IAppCollaborator collaborator;

    @Inject
    public MainPresenter(Navigator navigator, IAppCollaborator collaborator) {
        this.navigator = navigator;
        this.collaborator = collaborator;
    }

    public void initialize() {

    }

    public void onClick() {
        navigator.navigateToDetail();
    }

    public String getCollaboratorVersion() {
        return collaborator.getCollaboratorVersion();
    }
}
