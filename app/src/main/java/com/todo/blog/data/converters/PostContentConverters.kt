package com.todo.blog.data.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.todo.blog.data.timeline.PostContent


class PostContentConverters {
    @TypeConverter
    fun toStringFromPostContentList(postContents: List<PostContent>): String {
        return Gson().toJson(postContents)
    }

    @TypeConverter
    fun toPostContentListFromString(contentString: String): List<PostContent> {
        val type = object: TypeToken<List<PostContent>>() {}.type
        return Gson().fromJson(contentString, type)
    }

    @TypeConverter
    fun toStringFromHashtagsList(hashtags: List<String>): String {
        return Gson().toJson(hashtags)
    }

    @TypeConverter
    fun toHashtagsListFromString(hashtagsString: String): List<String> {
        val type = object: TypeToken<List<String>>() {}.type
        return Gson().fromJson(hashtagsString, type)
    }
}