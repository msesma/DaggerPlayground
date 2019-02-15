package eu.sesma.dagger.ui.main

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4

import junit.framework.Assert.assertEquals

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun useAppContext() {

        assertEquals("Test collaborator version", activityRule.activity.title)
    }
}
