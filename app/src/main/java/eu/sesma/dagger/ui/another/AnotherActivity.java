package eu.sesma.dagger.ui.another;

import eu.sesma.dagger.R;
import eu.sesma.dagger.ui.BaseActivity;
import eu.sesma.dagger.ui.detail.DetailPresenter;

import android.os.Bundle;

import javax.inject.Inject;

public class AnotherActivity extends BaseActivity {

    @Inject
    DetailPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        getActivityComponent().inject(this);

        presenter.initialize();
    }
}
