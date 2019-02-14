package eu.sesma.dagger.ui.another;

import eu.sesma.dagger.R;
import eu.sesma.dagger.ui.BaseActivity;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class AnotherActivity extends BaseActivity {

    @Inject
    AnotherPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        presenter.initialize();
    }
}
