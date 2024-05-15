package com.todo.blog.ui.timeline

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

enum class PostContentType {
    TEXT,
    IMAGE
}

@Composable
fun PostContent(
    postContentType: PostContentType,
    modifier: Modifier = Modifier
) {
    if (postContentType == PostContentType.TEXT) {
        PostContentText(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    vertical = dimensionResource(id = R.dimen.post_padding_vertical),
                    horizontal = dimensionResource(id = R.dimen.post_padding_horizontal)
                )
        )
    } else if (postContentType == PostContentType.IMAGE) {
        PostContentImage(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(id = R.dimen.post_padding_vertical)))
    }
}

@Composable
fun PostContentText(
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(id = R.string.example_post_content_text),
        modifier = modifier
    )
}

@Composable
fun PostContentImage(
    modifier: Modifier = Modifier
) {
   Image(
       painter = painterResource(id = R.drawable.example_post_content_image),
       contentDescription = stringResource(id = R.string.example_post_content_image_content_description),
       contentScale = ContentScale.Fit,
       modifier = modifier
   )
}

@Preview
@Composable
fun PreviewPostContentText() {
    BlogTheme() {
        PostContent(
            postContentType = PostContentType.TEXT
        )
    }
}

@Preview
@Composable
fun PreviewPostContentImage() {
    BlogTheme() {
        PostContent(
            postContentType = PostContentType.IMAGE
        )
    }
}