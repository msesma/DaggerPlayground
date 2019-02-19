Dagger 2 playground
================

# Dagger injection in a Multi-module app

## Description

This is a implementation of a multi-module application.
- **app**: This is the application module. Contains the application class, the dagger graph root, and a sample activity that you can think on as one that is difficult to extract to a feature module. There is a singleton dependency that will be accessible all across this module and we will change for a different implementation in Espresso test time.
- **module_core**: Here we put all the app wide dependencies, like API access, Database, etc. We could have several dependency modules like this. In this sample we have two collaborators, one singleton and one multi-instance.
- **module_main**: Feature module. This contains the main activity that has access to core dependencies and this module collaborators. In both cases we have singleton and multi-instance samples.
- **module_detail**: Simple feature module to demonstrate how to navigate from main and to app activities.


## Exercises

#### 1- Open the app and check the screen:
- Where The different messages come from?

#### 2- Open the logcat in android studio and filter by `==>:
- Notice the different instances of the main activity presenter dependencies.
- Navigate to detail activity
- Notice the different instances of the main activity navigator dependencies.
- Could you explain why `CoreCollaborator` instances are different but `CoreSingletonCollaborator` instances are the same?
- Could you explain why `MainCollaborator` instances are different but `MainScopedCollaborator` instances are the same?

#### 3- Navigate to App activity from DetailActivity:
- Notice the different instances of the app activity presenter dependencies.
- Could you explain why `AppSingletonCollaborator` instances are the same? 

#### 4- `AppSingletonCollaborator` is provided with a @Provides annotated method from the ApplicationModule:
- Notice that the method is annotated as @ApplicationScoped and not as @Singleton. Can you explain why?
- Change this @ApplicationScoped annotation for a @Singleton one and compile the App. Can you explain the error?

#### 5- Open `MainNavigator` in the module_main module and the `DetailNavigator` in the module_detail module:
- `MainNavigator` navigates to DetailActivity using the class of the Activity, but `DetailNavigator` needs to locate the class from the full path of the file. Why? 

#### 6- Let's see where the magic happen:
- Open module_core `CoreComponentProvider` file. It contains an interface implemented by out Application class `AndroidApplication` and a top level function to get the `CoreComponent`
- Looking to this class, `AndroidApplication` and `MainActivity` in the module_main, Can you explain how the multi-module dagger implementation works or are you a muggle?

#### 7- Espresso tests:
- Run Espresso tests. The message verified in `AppActivityTest` is not the message that the production implementation of `IAppSingletonCollaborator` shows in the AppActivity. Can you explain how Dagger select a different collaborator during test time?
- Think on how this can be used to change your API endpoint to a mocked server.`

