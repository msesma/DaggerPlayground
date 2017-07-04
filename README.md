Dagger 2 playground
================

# Subcomponents with builders mode

## Description

Changed files: ActivityComponent, ApplicationComponent, AndroidAplication, ApplicationModule, ActivityModule and BaseActivity.
Added files ActivityKey and ActivityBinding Module

Now ApplicationComponent and ActivityComponent have its own builders. Those component builders provide the instances by means of the @BindInstance annotations removing the need of the provides for Application and Activity on ApplicationComponent and ActivityComponent respectively. 
Note that builders can also be used with dependent components, not only with subcomponents.

Application component has a method to provide the ActivityComponent builder.
Subcomponents are now binded to main component via ActivityBindingModule.

####1- Change the git branch while on changed files to apreciate the changes. 
####2- Run the app and verify that instances behave like in dependency component mode.


