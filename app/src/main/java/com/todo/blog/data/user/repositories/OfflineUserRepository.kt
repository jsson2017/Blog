package com.todo.blog.data.user.repositories

import com.todo.blog.data.user.User
import com.todo.blog.data.user.UserDao
import kotlinx.coroutines.flow.Flow

class OfflineUserRepository(private val userDao: UserDao): UserRepository {
    override fun getUserStream(userId: Int): Flow<User> = userDao.getUser(userId)

    override suspend fun insertUser(user: User) = userDao.insert(user)

    override suspend fun deleteUser(user: User) = userDao.delete(user)

    override suspend fun updateUser(user: User) = userDao.update(user)

}