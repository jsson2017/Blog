package com.todo.blog.data.timeline

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.todo.blog.data.converters.PostContentConverters

@Database(entities = [Post::class], version = 1, exportSchema = false)
@TypeConverters(PostContentConverters::class)
abstract class PostDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao

    companion object {
        @Volatile
        private var Instance: PostDatabase? = null

        fun getDatabase(context: Context): PostDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, PostDatabase::class.java, "post_database")
                    .fallbackToDestructiveMigration().build().also { Instance = it }
            }
        }
    }
}