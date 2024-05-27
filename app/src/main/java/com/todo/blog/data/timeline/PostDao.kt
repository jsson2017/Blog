package com.todo.blog.data.timeline

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface PostDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(post: Post)

    @Update
    suspend fun update(post: Post)

    @Delete
    suspend fun delete(post: Post)

    @Query("SELECT  * from posts where id = :postId")
    fun getPost(postId: Int): Flow<Post>

    @Query("SELECT * from posts WHERE userID = :userId")
    fun getUserPosts(userId: Int): Flow<List<Post>>
}