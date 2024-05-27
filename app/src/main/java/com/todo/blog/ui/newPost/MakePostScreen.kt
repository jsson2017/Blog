package com.todo.blog.ui.newPost

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun MakePostScreen(
    closeButtonOnClick: () -> Unit,
    modifier: Modifier = Modifier,
    newPostViewModel: NewPostViewModel = viewModel()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        MakePostHeader(
            closeButtonOnClick = closeButtonOnClick,
            modifier = Modifier.padding(
                start = dimensionResource(id = R.dimen.make_post_general_padding),
                top = dimensionResource(id = R.dimen.make_post_general_padding),
                end = dimensionResource(id = R.dimen.make_post_general_padding),
            )
        )
        MakePostUserInfo(
            modifier = Modifier.padding(
                horizontal = dimensionResource(id = R.dimen.make_post_general_padding),
            )
        )
        MakePostContent(
            newPostText = newPostViewModel.newPostText,
            onUpdateNewPostText = newPostViewModel::updateNewPostText,
            modifier = Modifier.weight(1.0f)
        )
        MakePostTags(
            modifier = Modifier.padding(
                horizontal = dimensionResource(id = R.dimen.make_post_general_padding)
            )
        )
    }
}

@Preview
@Composable
fun PreviewMakePostScreen() {
    BlogTheme(darkTheme = true) {
        MakePostScreen(
            closeButtonOnClick = {}
        )
    }
}