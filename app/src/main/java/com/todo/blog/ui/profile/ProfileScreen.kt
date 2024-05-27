package com.todo.blog.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.todo.blog.R
import com.todo.blog.data.timeline.examplePosts
import com.todo.blog.ui.timeline.Post

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        item {
            ProfileUserInfo()
        }
        // TODO: Replace with actual data -> make data class + implement database
        items(examplePosts) { post ->
            Post(
                post = post,
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.post_padding_vertical))
            )
        }
    }

}