package com.todo.blog.ui.timeline

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.data.timeline.Post
import com.todo.blog.data.timeline.PostContent
import com.todo.blog.data.timeline.exampleTextPost
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun Post(
    post: Post,
    modifier: Modifier = Modifier
) {
    val postContents: List<PostContent> = post.contentList

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        PostHeader(
            username = stringResource(R.string.example_post_username),
            timestamp = post.timestamp,
        )
        for (postContent in postContents) {
            PostContent(
                postContentType = postContent.contentType,
                postContent = postContent.content
            )
        }
        PostFooter(
            noteCount = post.noteCount
        )
    }
}


@Preview(showBackground = false)
@Composable
fun PreviewPost() {
    BlogTheme {
        Post(
            post = exampleTextPost
        )
    }
}