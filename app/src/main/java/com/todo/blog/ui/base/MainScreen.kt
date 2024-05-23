package com.todo.blog.ui.base

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.todo.blog.R
import com.todo.blog.ui.newPost.MakePostScreen
import com.todo.blog.ui.profile.ProfileScreen
import com.todo.blog.ui.timeline.Timeline

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        bottomBar = { BottomNavigation(navController) },
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = "timeline",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("timeline") {
                Timeline()
            }
            composable("profile") {
                ProfileScreen()
            }
            composable("makePost") {
                MakePostScreen(
                    closeButtonOnClick = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}

@Composable
fun BottomNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomAppBar (
        actions = {
            items.forEach { screen ->
                BottomNavigationItem(
                    iconImageId = screen.iconResId,
                    iconImageDescriptionId = screen.iconDescriptionId,
                    isSelected = currentDestination?.hierarchy?.any { it.route == screen.route },
                    onNavigate = {
                        navigate(screen.route, navController)
                    },
                    modifier = modifier
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navigate(Screen.MakePost.route, navController)
                }
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_add_24),
                    contentDescription = stringResource(R.string.button_action_new_post)
                )
            }
        }
    )
}

fun navigate(
    destination: String,
    navController: NavHostController
) {
    navController.navigate(destination) {
        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(navController.graph.findStartDestination().id) {
            saveState = true
        }
        launchSingleTop = true
        restoreState = true
    }
}

@Composable
fun BottomNavigationItem(
    @DrawableRes iconImageId: Int,
    @StringRes iconImageDescriptionId: Int,
    isSelected: Boolean?,
    onNavigate: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onNavigate,
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(iconImageId),
            contentDescription = stringResource(iconImageDescriptionId),
            modifier = Modifier.alpha(
                if (isSelected == true) 1.0f else 0.6f
            )
        )
    }
}
