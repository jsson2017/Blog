package com.todo.blog.ui.timeline

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun PostFooter(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .padding(
                vertical = dimensionResource(id = R.dimen.post_padding_vertical),
                horizontal = dimensionResource(id = R.dimen.post_padding_horizontal)
            )
    ) {
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(
                text = "12,385 notes"
            )
        }
        PostFooterIcons()
    }
}

@Composable
fun PostFooterIcons(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ) {
        // Share button
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_arrow_outward_24),
                contentDescription = "share"
            )
        }
        // Comment button
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_chat_bubble_outline_24),
                contentDescription = "comment"
            )
        }
        // Reblog button
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_cached_24),
                contentDescription = "reblog"
            )
        }
        // Like button
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_star_outline_24),
                contentDescription = "like"
            )
        }
    }
}

@Preview
@Composable
fun PreviewPostFooter() {
    BlogTheme {
        PostFooter()
    }
}