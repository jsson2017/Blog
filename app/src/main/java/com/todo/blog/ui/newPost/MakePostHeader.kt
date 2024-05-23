package com.todo.blog.ui.newPost

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun MakePostHeader(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxWidth()
    ) {
        // Close Button
        Row(
            modifier = Modifier.weight(1.0f)
        ) {
            IconButton(
                onClick = { /*TODO*/ },
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_close_24),
                    contentDescription = stringResource(R.string.button_action_close)
                )
            }
        }

        // Post Button
        Button(
            onClick = { /*TODO*/ }
        ) {
            Text(
                text = stringResource(R.string.button_label_post)
            )
        }

        // More Button
        IconButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                painter = painterResource(R.drawable.baseline_more_vert_24),
                contentDescription = stringResource(R.string.more)
            )
        }
    }
}

@Preview
@Composable
fun PreviewMakePostHeader() {
    BlogTheme {
        MakePostHeader()
    }
}