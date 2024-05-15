package com.todo.blog.ui.timeline

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun PostHeader(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .padding(
                vertical = dimensionResource(id = R.dimen.post_padding_vertical),
                horizontal = dimensionResource(id = R.dimen.post_padding_horizontal)
            )
            .fillMaxWidth()
    ) {
        PostHeaderUser()
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = stringResource(R.string.more),
                modifier = Modifier.size(dimensionResource(id = R.dimen.post_more_icon_size))
            )
        }
    }
}

@Composable
fun PostHeaderUser(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(R.drawable.zack),
            contentDescription = stringResource(R.string.zack_icon_content_description),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.post_user_icon_size))
                .clip(RoundedCornerShape(dimensionResource(id = R.dimen.post_user_icon_corner_size)))
        )
        PostHeaderUsername(
            modifier = Modifier.padding(start = dimensionResource(id = R.dimen.post_header_padding))
        )
    }
}

@Composable
fun PostHeaderUsername(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.example_post_username),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = stringResource(R.string.example_post_timestamp),
        )
    }
}

@Preview
@Composable
fun PreviewPostHeader() {
    BlogTheme(darkTheme = false) {
        PostHeader()
    }
}

@Preview
@Composable
fun PreviewPostHeaderDark() {
    BlogTheme(darkTheme = true) {
        PostHeader()
    }
}