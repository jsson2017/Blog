package com.todo.blog.ui.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun ProfileBlogDetails(
    modifier: Modifier = Modifier
) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .height(2 * screenHeight / 3)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .background(color = Color.White)
        ) {
            Image(
                painter = painterResource(R.drawable.blog_details_example_image),
                contentDescription = stringResource(R.string.example_profile_details_image),
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(screenHeight / 3)
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.width(2 * screenWidth / 3)
        ) {
            // Profile image
            Image(
                painter = painterResource(R.drawable.zack),
                contentDescription = stringResource(R.string.example_post_username),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.profile_user_icon_size))
                    .clip(RoundedCornerShape(dimensionResource(id = R.dimen.post_user_icon_corner_size)))
                    .border(
                        BorderStroke(
                            dimensionResource(id = R.dimen.profile_user_icon_border),
                            Color.White
                        )
                    )
            )
            // Blog title
            Text(
                text = stringResource(R.string.example_blog_title),
                fontSize = 24.sp,
                color = Color.Black,
                modifier = Modifier.alpha(1.0f)
            )
            // Blog description
            Text(
                text = stringResource(R.string.example_blog_description),
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier.alpha(0.6f)
            )
        }
    }
}

@Preview
@Composable
fun PreviewProfileBlogDetails() {
    BlogTheme {
        ProfileBlogDetails()
    }
}