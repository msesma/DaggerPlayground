package eu.sesma.dagger.main

import android.content.Context
import android.content.Intent

@RunWith(RobolectricTestRunner::class)
class NavigatorShould {


    private val context: Context = mock()
    private val appCollaborator: IAppCollaborator = mock()
    private val actCollaborator: MainCollaborator = mock()
    private val baseActivity: BaseActivity = mock()

    private val intentArgumentCaptor = ArgumentCaptor.forClass(Intent::class.java)

    private lateinit var navigator: MainNavigator

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        navigator = MainNavigator(context, appCollaborator, actCollaborator, baseActivity)
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