package com.todo.blog.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.todo.blog.R
import com.todo.blog.ui.theme.BlogTheme

@Composable
fun ProfileHeader(
    modifier: Modifier = Modifier
) {
    val colorFadedBlack = Color(0f, 0f, 0f, 0.7f)
    val colorBlank = Color(0f, 0f, 0f, 0f)
    val gradientBlackBlank = Brush.verticalGradient(0f to colorFadedBlack, 1000f to colorBlank)

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxWidth()
            .background(gradientBlackBlank)
            .padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 8.dp)
    ) {
        Text(
            text = "placeholderUserName"
        )
        IconButton(
            onClick = {
                /* TODO: take user to settings where they can log out. */
            }
        ) {
            Icon(
                painter = painterResource(R.drawable.baseline_settings_24),
                contentDescription = stringResource(R.string.button_settings)
            )
        }
    }
}

@Preview
@Composable
fun PreviewProfileHeader() {
    BlogTheme {
        ProfileHeader()
    }
}