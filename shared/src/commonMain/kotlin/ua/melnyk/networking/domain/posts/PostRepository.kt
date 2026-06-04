package ua.melnyk.networking.domain.posts

import ua.melnyk.networking.data.common.NetworkResult
import ua.melnyk.networking.data.posts.model.requests.NewPost
import ua.melnyk.networking.data.posts.model.responces.DeletedPost
import ua.melnyk.networking.data.posts.model.responces.Post
import ua.melnyk.networking.data.posts.model.responces.Posts

internal interface PostRepository {
     suspend fun getAllPost(): NetworkResult<Posts>
     suspend fun addPost(post: NewPost): NetworkResult<Post>
     suspend fun updatePost(post: Post): NetworkResult<Post>
     suspend fun deletePost(postId: Int): NetworkResult<DeletedPost>
}