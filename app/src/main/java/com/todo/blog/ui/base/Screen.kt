package com.todo.blog.ui.base

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.todo.blog.R

sealed class Screen(val route: String, @DrawableRes val iconResId: Int, @StringRes val iconDescriptionId: Int) {
    data object Timeline : Screen("timeline", R.drawable.baseline_home_filled_24, R.string.screen_timeline)
    data object Profile: Screen("profile", R.drawable.baseline_person_24, R.string.screen_profile)
    data object MakePost: Screen("makePost", R.drawable.baseline_add_24, R.string.screen_make_post)
}

val items = listOf(
    Screen.Timeline,
    Screen.Profile
)