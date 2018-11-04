package com.paradigmadigital.dagger.ui.main;

import com.paradigmadigital.dagger.R;
import com.paradigmadigital.dagger.ui.BaseActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.inject.Inject;

import eu.sesma.library.LibraryMain;

public class MainActivity extends BaseActivity {

    @Inject
    MainPresenter presenter;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            presenter.onClick();
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);

        presenter.initialize();
        setTitle(presenter.getAppCollaboratorVersion());
        ((Button) findViewById(R.id.button)).setOnClickListener(listener);

        LibraryMain libraryMain = new LibraryMain();
        libraryMain.initialize();

        ((TextView)findViewById(R.id.textView2)).setText(presenter.getLibraryCollaboratorGreet());

        ((TextView)findViewById(R.id.textView3)).setText(presenter.getCoreCollaboratorGreet());
    }
}
