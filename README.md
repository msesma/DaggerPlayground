Dagger 2 playground
================

# Subcomponents mode

## Description

Changed files: ActivityComponent, ApplicationComponent and BaseActivity.
Now ActivityComponent is a Subcomponent and is provided by means a plus function from ApplicationComponent. 

## Instrumentation Tests
AppCollaborator is injected as IAppCollaborator interface (Sorry for the old naming style) and have two versions, the one used in the app and the one for instrumentation tests. think on this collaborator as the Network API repository or whatever other class you must mock app level in your instrumentation tests.

Using a custom instrumentation runner and extending AndroidApplication and ApplicationComponent with test versions, we are able to substitute ApplicationModule (Or any other app level module) by the one that provides Mock version of the desired classes like AppCollaborator.

####1- Change the git branch while on changed files to apreciate the changes. 
####2- Run the app and verify that instances behave like in dependency component mode.


