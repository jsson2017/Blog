package com.todo.blog.ui.newPost

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun MakePostContent(
    newPostText: String,
    onUpdateNewPostText: (String) -> Unit,
    onUpdateNewPostUiState: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = newPostText,
        onValueChange = {
            onUpdateNewPostText(it)
            onUpdateNewPostUiState(it)
        },
        placeholder = {
            Text(
                text = stringResource(R.string.make_post_content_hint)
            )
        },
        colors = TextFieldDefaults.colors(
            focusedTextColor = MaterialTheme.colorScheme.onBackground,
            unfocusedTextColor = MaterialTheme.colorScheme.onBackground,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        modifier = modifier
            .fillMaxWidth()
    )
}

@Preview
@Composable
fun PreviewMakePostContent() {
    BlogTheme {
        MakePostContent(
            newPostText = "test text",
            onUpdateNewPostText = {},
            onUpdateNewPostUiState = {}
        )
    }
}