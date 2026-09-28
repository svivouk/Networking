package ua.melnyk.networking.domain.posts

import ua.melnyk.networking.data.common.Result
import ua.melnyk.networking.data.posts.model.requests.NewPost
import ua.melnyk.networking.data.posts.model.responces.Post
import ua.melnyk.networking.data.posts.model.responces.Posts

internal interface PostRepository {
    suspend fun getAllPost(): Result<Posts>
    suspend fun addPost(post: NewPost): Result<String>
    suspend fun updatePost(post: Post): Result<String>
    suspend fun deletePost(postId: Int): Result<String>
}