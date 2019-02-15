package eu.sesma.dagger

import android.content.Context
import android.content.Intent
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.whenever
import eu.sesma.dagger.ui.ActCollaborator
import eu.sesma.dagger.ui.IAppCollaborator
import eu.sesma.dagger.ui.Navigator
import eu.sesma.dagger.ui.another.AnotherActivity
import eu.sesma.dagger.ui.detail.DetailActivity
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Mockito.doNothing
import org.mockito.MockitoAnnotations
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class NavigatorShould {


    private val context: Context = mock()
    private val appCollaborator: IAppCollaborator = mock()
    private val actCollaborator: ActCollaborator = mock()
    private val baseActivity: BaseActivity = mock()

    private val intentArgumentCaptor = ArgumentCaptor.forClass(Intent::class.java)

    private lateinit var navigator: Navigator

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        navigator = Navigator(context, appCollaborator, actCollaborator, baseActivity)
        doNothing().whenever(baseActivity).startActivity(intentArgumentCaptor.capture())
    }

    @Test
    fun navigateToDetailOnMethodCall() {

        navigator.navigateToDetail()

        assertEquals(DetailActivity::class.java.name, intentArgumentCaptor.value.component?.className)
    }

    @Test
    fun navigateToAnotherOnMethodCall() {

        navigator.navigateToAnother()

        assertEquals(AnotherActivity::class.java.name, intentArgumentCaptor.value.component?.className)
    }
}