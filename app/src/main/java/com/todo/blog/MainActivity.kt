package com.todo.blog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.todo.blog.ui.theme.BlogTheme
import com.todo.blog.ui.timeline.Post
import com.todo.blog.ui.timeline.PostContentType
import com.todo.blog.ui.timeline.Timeline

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BlogTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Timeline(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BlogTheme {
        Post(postContentType = PostContentType.TEXT)
    }
}