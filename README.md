Dagger 2 playground
================

# Injection in module

## Description

This is an evolution of the previous 5-Injection in module branch. Collaborators in a new `core` module are accessible both from the main `app` module and from the `library` module.
This is limited to collaborators hat don't require a `@provides` in the main app because the main `app` is not accessible from the `library` module, but a dagger module with its own `@provides` methods could be created in the `library` graph.

`MainActivity` shows a message gotten from a `CoreCollaborator` method, and another message from a `LibraryCollaborator` method that in turn includes a message that the later has gorren from `CoreCollaborator`

The limitation of this approach is that libraries cannot access main app provided dependencies.

## Exercises

####1- Open tha app and check the screen:
- Where The different messages come from?


