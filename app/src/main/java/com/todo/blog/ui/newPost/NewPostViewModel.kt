package com.todo.blog.ui.newPost

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.todo.blog.data.timeline.Post
import com.todo.blog.data.timeline.PostContent
import com.todo.blog.data.timeline.PostContentType
import com.todo.blog.data.timeline.repositories.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class NewPostViewModel(
    private val postRepository: PostRepository
): ViewModel() {

    /**
     * Holds current new post text state
     */
    var newPostText by mutableStateOf("")
        private set

    /**
     * Holds current  UI state for New Post Screen
     */
    private val _uiState = MutableStateFlow(NewPostUiState())

    /**
     * Updates [newPostText] with the value provided in the argument.
     */
    fun updateNewPostText(updatedText: String) {
        newPostText = updatedText
    }

    /**
     * Check if new post content is valid for post creation
     */
    private fun verifyNewPost(post: Post): Boolean {
        return post.contentList.isNotEmpty()
    }

    /**
     * Updates [NewPostUiState] with the value provided in the argument.
     * TODO: Currently handles single text post. Need to handle multiple + images
     */
    fun updateNewPostUiState(contentText: String) {
        _uiState.update { currentState ->
            currentState.copy(
                contentList = listOf(PostContent(
                    contentType = PostContentType.TEXT,
                    content = contentText
                ))
            )
        }
    }

    /**
     * Adds new post entity entry to posts database
     * TODO: Replace hard coded values (timestamp and userId)
     */
    suspend fun publishNewPost() {
        postRepository.insertPost(
            Post(
                id = 0,
                userId = 0,
                timestamp = "April 25th, 2024",
                noteCount = 0,
                contentList = listOf(
                    PostContent(
                        contentType = PostContentType.TEXT,
                        content = newPostText
                    )
                ),
                hashtags = emptyList()
            )
        )
    }
}

data class NewPostUiState(
    val id: Int = 0,
    val userId: Int = 0,
    val timestamp: String = "",
    val noteCount: Int = 0,
    val contentList: List<PostContent> = emptyList(),
    val hashtags: List<String> = emptyList(),
    val isValid: Boolean = false
)
