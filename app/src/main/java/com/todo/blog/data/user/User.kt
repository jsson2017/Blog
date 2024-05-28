package com.todo.blog.data.user

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Int = 0,
    val username: String,
    val iconUri: String,
    val email: String,
    val password: String, /* This should be made more secure in actual implementation */
)

val exampleUser = User(
    userId = 0,
    username = "zackfairfan64",
    iconUri = "",
    email = "zackfanforever@gmail.com",
    password = "password"
)