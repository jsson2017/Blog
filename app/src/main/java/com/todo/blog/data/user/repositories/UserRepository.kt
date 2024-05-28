package com.todo.blog.data.user.repositories

import com.todo.blog.data.user.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    /**
     * Retrieve user from the given data source that matches with the [userId]
     */
    fun getUserStream(userId: Int): Flow<User>

    /**
     * Insert user into data source
     */
    suspend fun insertUser(user: User)

    /**
     * Delete post from data source
     */
    suspend fun deleteUser(user: User)

    /**
     * Update user in the data source
     */
    suspend fun updateUser(user: User)
}