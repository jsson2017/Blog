package com.todo.blog.ui.timeline

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun Post(
    postContentType: PostContentType,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        PostHeader()
        PostContent(
            postContentType = postContentType
        )
        PostFooter()
    }
}


@Preview(showBackground = false)
@Composable
fun PreviewPost() {
    BlogTheme {
        Post(postContentType = PostContentType.TEXT)
    }
}