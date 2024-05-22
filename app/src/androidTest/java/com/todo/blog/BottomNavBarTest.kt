package com.todo.blog

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.todo.blog.ui.base.MainScreen
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class BottomNavBarTest {

    @get:Rule
    val composeTestRule = createComposeRule()
    private lateinit var navController: TestNavHostController

    @Before
    fun setupAppNavHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current)
            navController.navigatorProvider.addNavigator(ComposeNavigator())
            MainScreen(navController = navController)
        }
    }

    @Test
    fun mainScreenBottomNav_verifyStartDestination() {
        val route = navController.currentBackStackEntry?.destination?.route
        assertEquals(route, "timeline")
    }

    @Test
    fun mainScreenBottomNav_navigateToProfile() {
        composeTestRule.onNodeWithContentDescription("go to profile")
            .performClick()

        val route = navController.currentBackStackEntry?.destination?.route
        assertEquals(route, "profile")
    }

    @Test
    fun mainScreenBottomNav_navigateToMakePost() {
        composeTestRule.onNodeWithContentDescription("make new post")
            .performClick()

        val route = navController.currentBackStackEntry?.destination?.route
        assertEquals(route, "makePost")
    }

    @Test
    fun mainScreenBottomNav_navigateBackToTimeline() {
        composeTestRule.onNodeWithContentDescription("go to profile")
            .performClick()
        composeTestRule.onNodeWithContentDescription("go to timeline")
            .performClick()

        val route = navController.currentBackStackEntry?.destination?.route
        assertEquals(route, "timeline")
    }

    @Test
    fun mainScreenBottomNav_clickingSameNavDestinationDoesNothing() {
        composeTestRule.onNodeWithContentDescription("go to timeline")
            .performClick()
            .performClick()
            .performClick()

        val route = navController.currentBackStackEntry?.destination?.route
        assertEquals(route, "timeline")
    }
}
