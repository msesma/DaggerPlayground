Dagger 2 playground
================

# Dependent components mode

### Description

In dependent component mode, Dagger 2 uses only components. Here we have two of them, one for the whole application (ApplicationComponent), and one shared by all the activities (ActivityComponent).

There are three activities, Main has a button to open Detail that has a button to open Another. Dagger is using Scopes by means of the @PerActivity annotation, what means that every activity will have its own "context singletons" in addition to the app wide singletons.

In order to verify wich instances are injected in wich Scope, the Navigator class will log collaborator instances.


### Exercises

#####1- Open tha app, navigate to detail, another and check the logs: 
- Context and AppCollaborator share the same instance in Navigator logs, why?
- Activity and ActCollaborator are different instances in Navigator logs, why?
- ActCollaborator share the same instance between DetailPresenter and the second Navigator log, why?

#####2- In `ApplicationModule` comment out the `Singleton` annotation from `AppCollaborator` and run again: 
- AppCollaborator is no longer the same instance, why?

#####3- In `ApplicationModule` set back the `Singleton` annotation to `AppCollaborator`. Now in `ApplicationComponent` comment out the `AppColaborator provideAppCollaborator();` line  and run again: 
- AppCollaborator is no longer the same instance, why?


