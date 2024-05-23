package com.todo.blog.ui.newPost

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun MakePostTags(
    modifier: Modifier = Modifier
) {
    // TODO: Replace with viewmodel
    val tags = remember { mutableStateListOf<String>("exampleTag", "example tag 2", "exampletag3") }

    if (tags.isEmpty()) {
        Row(
            modifier = modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /* TODO: OPEN ADD TAG BOTTOM DRAWER */ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.make_post_tag_hint))
            }
        }
    } else {
        LazyRow(
            modifier = modifier.fillMaxWidth()
        ) {
            item {
                Button(
                    onClick = { /* TODO: OPEN ADD TAG BOTTOM DRAWER */ },
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_add_24),
                        contentDescription = stringResource(R.string.button_action_add_tag)
                    )
                }
            }
            items(tags) { tag ->
                Button(
                    onClick = {},
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(text = "#${tag}")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewMakePostTags() {
    BlogTheme {
        MakePostTags()
    }
}