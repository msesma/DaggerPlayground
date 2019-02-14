package eu.sesma.dagger.di;

import eu.sesma.dagger.platform.ActivityModule;
import eu.sesma.dagger.ui.BaseActivity;
import eu.sesma.dagger.ui.another.AnotherActivity;
import eu.sesma.dagger.ui.detail.DetailActivity;
import eu.sesma.dagger.ui.main.MainActivity;

import dagger.BindsInstance;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(
        modules = ActivityModule.class
)
public interface ActivityComponent {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder activity(BaseActivity activity);

        ActivityComponent build();
    }

    void inject(MainActivity mainActivity);

    void inject(DetailActivity detailActivity);

    void inject(AnotherActivity anotherActivity);
}
