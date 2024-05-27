package com.todo.blog.ui

import android.app.Application
import com.todo.blog.data.AppContainer
import com.todo.blog.data.AppDataContainer

class BlogApplication: Application() {

    /**
     * AppContainer instance used by the rest of the classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}