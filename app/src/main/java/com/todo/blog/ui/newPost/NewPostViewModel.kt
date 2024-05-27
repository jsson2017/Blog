package com.todo.blog.ui.newPost

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class NewPostViewModel: ViewModel() {

    /**
     * Holds current new post text state
     */
    var newPostText by mutableStateOf("")
        private set


    /**
     * Updates [newPostText] with the value provided in the argument.
     */
    fun updateNewPostText(updatedText: String) {
        newPostText = updatedText
    }

}
