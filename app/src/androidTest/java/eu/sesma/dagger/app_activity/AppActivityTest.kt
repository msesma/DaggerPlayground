package eu.sesma.dagger.app_activity

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import eu.sesma.dagger.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppActivityTest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule(AppActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun useAppContext() {

        Espresso.onView(ViewMatchers.withId(R.id.text_view_for_test))
                .check(matches(withText("AppSingletonCollaborator test mode")))
    }
}
