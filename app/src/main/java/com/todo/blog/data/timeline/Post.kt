package com.todo.blog.data.timeline

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Post(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userId: Int,
    val timestamp: String,
    val noteCount: Int,
    val contentList: List<PostContent>
)

val exampleTextPost = Post(
    id = 0,
    userId = 0,
    timestamp = "April 25th, 2024",
    noteCount = 12385,
    contentList = listOf<PostContent>(
        PostContent(
            contentType = PostContentType.TEXT,
            content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Urna et pharetra pharetra massa massa ultricies mi quis. Neque gravida in fermentum et sollicitudin ac. Viverra suspendisse potenti nullam ac tortor vitae. At tellus at urna condimentum mattis. Id interdum velit laoreet id. Augue mauris augue neque gravida in fermentum. Mattis nunc sed blandit libero volutpat sed cras ornare arcu. Netus et malesuada fames ac. Vitae justo eget magna fermentum iaculis eu. At elementum eu facilisis sed odio morbi quis commodo. Quis viverra nibh cras pulvinar mattis nunc. Laoreet id donec ultrices tincidunt arcu non sodales neque sodales. Varius morbi enim nunc faucibus a. A pellentesque sit amet porttitor eget dolor morbi non arcu."
        ),
    )
)

val exampleImagePost = Post(
    id = 1,
    userId = 0,
    timestamp = "April 26th, 2024",
    noteCount = 12386,
    contentList = listOf<PostContent>(
        PostContent(
            contentType = PostContentType.IMAGE,
            content = "https://hips.hearstapps.com/hmg-prod/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg"
        )
    )
)

val exampleMultipleContentTypePost = Post(
    id = 2,
    userId = 0,
    timestamp = "April 27th, 2024",
    noteCount = 10,
    contentList = listOf<PostContent>(
        PostContent(
            contentType = PostContentType.TEXT,
            content = "Lorem ipsum blah blah blah"
        ),
        PostContent(
            contentType = PostContentType.IMAGE,
            content = "https://hips.hearstapps.com/hmg-prod/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg"
        )
    )
)

val examplePosts : List<Post> = listOf<Post>(exampleTextPost, exampleImagePost, exampleMultipleContentTypePost)