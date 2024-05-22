package com.todo.blog.ui.newPost

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MakePostScreen(
    modifier: Modifier = Modifier
) {
    /*
    * Make post screen composition:
    *
    * Top bar:
    *   1. X button to close
    *   2. Post button to post
    *   3. Post options (let's leave this out for now)
    *
    * User Info:
    *   1. User icon in circle
    *   2. User name
    *
    * Post Content: might need to play around with this.
    *   1. Text box user can type in
    *   2. Let user pick images from their library
    *   3. Give app permission to open camera (maybe save for later)
    *
    * Tags:
    *   1. Big button informing user to add tags - pressing this opens a bottom drawer
    *
    * */
    Text(
        text = "Placeholder for New Post Screen"
    )
}