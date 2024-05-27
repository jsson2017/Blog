package com.todo.blog.data

import android.content.Context
import com.todo.blog.data.timeline.PostDatabase
import com.todo.blog.data.timeline.repositories.OfflinePostRepository
import com.todo.blog.data.timeline.repositories.PostRepository

/**
 * App Container for dependency injection
 */
interface AppContainer {
    val postRepository: PostRepository
}

/**
 * [AppContainer] implementation that provides instance of OfflinePostRepository
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [postRepository]
     */
    override val postRepository: PostRepository by lazy{
        OfflinePostRepository(PostDatabase.getDatabase(context).postDao())
    }
}