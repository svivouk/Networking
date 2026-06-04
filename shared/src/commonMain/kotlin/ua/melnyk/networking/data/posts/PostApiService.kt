package ua.melnyk.networking.data.posts

import ua.melnyk.networking.data.common.NetworkResult
import ua.melnyk.networking.data.posts.model.requests.NewPost
import ua.melnyk.networking.data.posts.model.responces.DeletedPost
import ua.melnyk.networking.data.posts.model.responces.Post
import ua.melnyk.networking.data.posts.model.responces.Posts

internal const val BASE_URL = "https://dummyjson.com/"
internal const val POSTS_API = "posts"
internal const val ADD_POST = "add"

internal interface PostApiService {
    suspend fun getAllPost(): NetworkResult<Posts>
    suspend fun addPost(post: NewPost): NetworkResult<Post>
    suspend fun updatePost(post: Post): NetworkResult<Post>
    suspend fun deletePost(postId: Int): NetworkResult<DeletedPost>
}