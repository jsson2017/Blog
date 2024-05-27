package com.todo.blog.data.timeline.repositories

import com.todo.blog.data.timeline.Post
import kotlinx.coroutines.flow.Flow

interface PostRepository {
    /**
     * Retrieve all posts made by a specific user from the given data source
     */
    fun getAllPostsFromUserStream(userId: Int): Flow<List<Post>>

    /**
     * Retrieve a post from the given data source that matches with the [postId]
     */
    fun getPostStream(postId: Int): Flow<Post>

    /**
     * Insert post into data source
     */
    suspend fun insertPost(post: Post)

    /**
     * Delete post from data source
     */
    suspend fun deletePost(post: Post)

    /**
     * Update post in the data source
     */
    suspend fun updatePost(post: Post)
}