package com.todo.blog.ui.newPost

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.todo.blog.R
import com.todo.blog.ui.AppViewModelProvider
import com.todo.blog.ui.theme.BlogTheme
import kotlinx.coroutines.launch

@Composable
fun MakePostScreen(
    closeButtonOnClick: () -> Unit,
    modifier: Modifier = Modifier,
    newPostViewModel: NewPostViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        MakePostHeader(
            closeButtonOnClick = closeButtonOnClick,
            onClickPublishPost = {
                coroutineScope.launch {
                    newPostViewModel.publishNewPost()
                }
            },
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
            onUpdateNewPostUiState = newPostViewModel::updateNewPostUiState,
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