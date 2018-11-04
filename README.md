Dagger 2 playground
================

# Injection in module

## Description

Simple implementation of dagger injection on a app module (Library).
Module `library` injects the `LibraryCollaborator` into `LibraryMain` when the main activity calls its `initialize()` method using only JSR330, but we coukd add modules, subcomponents, scopes or whatever.


The limitation of this approach is that libraries cannot access main app provided dependencies.

## Exercises

####1- Open tha app and check the logs: 
- Verify this log: `D/LibraryMain: Hello collaborator -Hello, LibraryMain` and check how it is generated


