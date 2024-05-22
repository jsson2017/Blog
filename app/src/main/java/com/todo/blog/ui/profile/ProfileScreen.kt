package com.todo.blog.ui.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.todo.blog.R
import com.todo.blog.ui.timeline.Post
import com.todo.blog.ui.timeline.PostContentType

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize()
    ) {
        item {
            ProfileUserInfo()
        }
        // TODO: Replace with actual data -> make data class + implement database
        item {
            Post(
                postContentType = PostContentType.TEXT,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_between_posts))
            )
        }
        item {
            Post(
                postContentType = PostContentType.IMAGE,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_between_posts))
            )
        }
    }

}