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
import com.todo.blog.data.timeline.PostContentType
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun PostContent(
    postContentType: PostContentType,
    postContent: String,
    modifier: Modifier = Modifier
) {
    if (postContentType == PostContentType.TEXT) {
        PostContentText(
            postText = postContent,
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
    postText: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = postText,
        modifier = modifier
    )
}

@Composable
fun PostContentImage(
    modifier: Modifier = Modifier,
    imageURL: String = "", /* TODO: Use URL to grab image */
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
            postContentType = PostContentType.TEXT,
            postContent = stringResource(id = R.string.example_post_content_text)
        )
    }
}

@Preview
@Composable
fun PreviewPostContentImage() {
    BlogTheme() {
        PostContent(
            postContentType = PostContentType.IMAGE,
            postContent = ""
        )
    }
}