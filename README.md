Dagger 2 playground
================

# Subcomponents with builders mode

### Description

Using components with dependency or subcomponents We were able to create the  `ActivityComponent`  at the `BaseActivity` level and then use it to inject properties into the top level activities. 

Thas way, when we injected `Activity` into collaborators the current `ActivityComponent` that held the current Activity was used. Easy.

The problem with Android Injector is that we don't instantiate the `ActivityComponent` from the code anymore, it is `AndroidInjector` who does the magic, so we need to provide each Activity in its own module.

For example Main:

    @Module
    public abstract class MainActivityModule {
        @Provides
        @PerActivity
        static Activity provideActivity(MainActivity activity) {
            return activity;
        }
    }

Detail:

    @Module
    public abstract class DetailActivityModule {
        @Provides
        @PerActivity
        static Activity provideActivity(DetailActivity activity) {
            return activity;
        }
    }

Common provides:

    @Module
    public abstract class ActivityModule {
        @Provides
        @PerActivity
        static ActColaborator provideActCollaborator() {
            return new ActColaborator();
        }
    }

Then we declare them in Main:

    @PerActivity
    @Subcomponent(modules = { ActivityModule.class, MainActivityModule.class})
    public interface MainActivityComponent extends AndroidInjector<MainActivity> {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<MainActivity> {
        }
    }

And detail:

    @PerActivity
    @Subcomponent(modules = { ActivityModule.class, DetailActivityModule.class})
    public interface DetailActivityComponent extends AndroidInjector<DetailActivity> {
        @Subcomponent.Builder
        abstract class Builder extends AndroidInjector.Builder<DetailActivity> {
        }
    }


And finally, we can inject the current activity in our shared collaborator:

    private final Activity activity;

    @Inject
    public Navigator(Activity activity) {
        this.activity = activity;
    }



### Exercises

#####1- Change the git branch while on changed files to apreciate the changes. 
#####2- Run the app and verify that instances behave like in dependency component mode.



