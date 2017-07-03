package com.paradigmadigital.dagger;

import com.paradigmadigital.dagger.ui.ActCollaborator;
import com.paradigmadigital.dagger.ui.BaseActivity;
import com.paradigmadigital.dagger.ui.IAppCollaborator;
import com.paradigmadigital.dagger.ui.Navigator;
import com.paradigmadigital.dagger.ui.another.AnotherActivity;
import com.paradigmadigital.dagger.ui.detail.DetailActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;

import android.content.Context;
import android.content.Intent;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;

@RunWith(RobolectricTestRunner.class)
public class NavigatorShould {

    @Mock
    Context context;
    @Mock
    IAppCollaborator appCollaborator;
    @Mock
    ActCollaborator actCollaborator;
    @Mock
    BaseActivity baseActivity;

    @Captor
    ArgumentCaptor<Intent> intentArgumentCaptor;

    private Navigator navigator;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        navigator = new Navigator(context, appCollaborator, actCollaborator, baseActivity);
        doNothing().when(baseActivity).startActivity(intentArgumentCaptor.capture());
    }

    @Test
    public void navigateToDetailOnMethodCall() {

        navigator.navigateToDetail();

        Intent intent = intentArgumentCaptor.getValue();
        assertThat(intentArgumentCaptor.getValue().getComponent().getClassName())
                .isEqualTo(DetailActivity.class.getName());
    }

    @Test
    public void navigateToAnotherOnMethodCall() {

        navigator.navigateToAnother();

        Intent intent = intentArgumentCaptor.getValue();
        assertThat(intentArgumentCaptor.getValue().getComponent().getClassName())
                .isEqualTo(AnotherActivity.class.getName());
    }
}