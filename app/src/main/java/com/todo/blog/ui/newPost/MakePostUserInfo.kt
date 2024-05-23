package com.todo.blog.ui.newPost

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun MakePostUserInfo(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.user_icon_padding))
    ) {
        Image(
            painter = painterResource(R.drawable.zack),
            contentDescription = stringResource(R.string.zack_icon_content_description),
            modifier = Modifier
                .size((dimensionResource(id = R.dimen.post_user_icon_size)))
                .clip(CircleShape)
        )
        Text(
            text = stringResource(R.string.example_post_username),
            modifier = Modifier
                .padding(start = dimensionResource(id = R.dimen.make_post_username_padding))
        )
    }
}

@Preview
@Composable
fun PreviewMakePostUserInfo() {
    BlogTheme {
        MakePostUserInfo()
    }
}