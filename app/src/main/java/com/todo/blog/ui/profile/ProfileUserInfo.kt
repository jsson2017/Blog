package com.todo.blog.ui.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileUserInfo(
    modifier: Modifier = Modifier
) {
    Box(
        modifier.fillMaxWidth()
    ) {
        ProfileBlogDetails()
        ProfileHeader()
    }
}
