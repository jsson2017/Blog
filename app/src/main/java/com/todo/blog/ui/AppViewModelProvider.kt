package com.todo.blog.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.todo.blog.BlogApplication
import com.todo.blog.ui.newPost.NewPostViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            NewPostViewModel(
                blogApplication().container.postRepository
            )
        }
    }
}

fun CreationExtras.blogApplication(): BlogApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as BlogApplication)