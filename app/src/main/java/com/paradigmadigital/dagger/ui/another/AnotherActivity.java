package com.paradigmadigital.dagger.ui.another;

import com.paradigmadigital.dagger.R;
import com.paradigmadigital.dagger.ui.BaseActivity;
import com.paradigmadigital.dagger.ui.detail.DetailPresenter;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class AnotherActivity extends BaseActivity {

    @Inject
    DetailPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        presenter.initialize();
    }
}
