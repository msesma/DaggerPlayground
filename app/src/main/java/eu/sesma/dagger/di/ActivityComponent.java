package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityModule;
import eu.sesma.dagger.ui.ActCollaborator;
import eu.sesma.dagger.ui.BaseActivity;
import eu.sesma.dagger.ui.another.AnotherActivity;
import eu.sesma.dagger.ui.detail.DetailActivity;
import eu.sesma.dagger.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(
        dependencies = ApplicationComponent.class,
        modules = ActivityModule.class
)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);

    void inject(AnotherActivity anotherActivity);

    //Exposed to sub-graphs.
    BaseActivity activity();

    ActCollaborator provideActCollaborator();
}
