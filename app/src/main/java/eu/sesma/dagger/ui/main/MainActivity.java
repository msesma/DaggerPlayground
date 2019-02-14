package eu.sesma.dagger.ui.main;

import eu.sesma.dagger.R;
import eu.sesma.dagger.ui.BaseActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

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
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.initialize();
        setTitle(presenter.getCollaboratorVersion());
        ((Button) findViewById(R.id.button)).setOnClickListener(listener);
    }
}
