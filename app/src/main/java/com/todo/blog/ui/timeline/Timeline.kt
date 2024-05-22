package com.todo.blog.ui.timeline

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun Timeline(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = modifier.fillMaxSize()
    ) {
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

@Preview
@Composable
fun PreviewTimeline() {
    BlogTheme() {
        Timeline()
    }
}