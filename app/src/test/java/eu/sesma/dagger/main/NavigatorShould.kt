package eu.sesma.dagger.main

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import com.nhaarman.mockito_kotlin.doNothing
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import eu.sesma.dagger.core.CoreCollaborator
import eu.sesma.dagger.core.CoreSingletonCollaborator
import eu.sesma.dagger.detail.DetailActivity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class NavigatorShould {

    private val context: Context = mock()
    private val coreCollaborator: CoreCollaborator = mock()
    private val coreSingletonCollaborator: CoreSingletonCollaborator = mock()
    private val mainCollaborator: MainCollaborator = mock()
    private val mainScopedCollaborator: MainScopedCollaborator = mock()
    private val activity: AppCompatActivity = mock()


    private val intentArgumentCaptor = ArgumentCaptor.forClass(Intent::class.java)

    private lateinit var navigator: MainNavigator

    @Before
    fun setup() {
        navigator = MainNavigator(context, coreCollaborator, coreSingletonCollaborator, mainCollaborator, mainScopedCollaborator, activity)
        doNothing().whenever(activity).startActivity(intentArgumentCaptor.capture())
    }

    @Test
    fun navigateToDetailOnMethodCall() {

        navigator.navigateToDetail()

        assertEquals(DetailActivity::class.java.name, intentArgumentCaptor.value.component?.className)
    }
}