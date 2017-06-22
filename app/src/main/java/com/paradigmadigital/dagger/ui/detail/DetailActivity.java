package com.paradigmadigital.dagger.ui.detail;

import com.paradigmadigital.dagger.R;
import com.paradigmadigital.dagger.ui.BaseActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

public class DetailActivity extends BaseActivity {

    @Inject
    DetailPresenter presenter;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter.onClick();
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getActivityComponent().inject(this);

        presenter.initialize();
        ((Button) findViewById(R.id.button)).setOnClickListener(listener);
    }
}
