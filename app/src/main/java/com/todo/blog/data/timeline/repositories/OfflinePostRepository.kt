package com.todo.blog.data.timeline.repositories

import com.todo.blog.data.timeline.Post
import com.todo.blog.data.timeline.PostDao
import kotlinx.coroutines.flow.Flow

class OfflinePostRepository(private val postDao: PostDao) : PostRepository {
    override fun getAllPostsFromUserStream(userId: Int): Flow<List<Post>> =
        postDao.getUserPosts(userId)

    override fun getPostStream(postId: Int): Flow<Post> = postDao.getPost(postId)

    override suspend fun insertPost(post: Post) = postDao.insert(post)

    override suspend fun deletePost(post: Post) = postDao.delete(post)

    override suspend fun updatePost(post: Post) = postDao.update(post)
}