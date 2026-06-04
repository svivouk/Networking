package ua.melnyk.networking.domain.posts

import ua.melnyk.networking.data.common.NetworkResult
import ua.melnyk.networking.data.posts.PostApiService
import ua.melnyk.networking.data.posts.model.requests.NewPost
import ua.melnyk.networking.data.posts.model.responces.DeletedPost
import ua.melnyk.networking.data.posts.model.responces.Post
import ua.melnyk.networking.data.posts.model.responces.Posts

internal class AppPostRepository(
    private val postApiService: PostApiService
): PostRepository {
    override suspend fun getAllPost(): NetworkResult<Posts> {
        return postApiService.getAllPost()
    }

    override suspend fun addPost(post: NewPost): NetworkResult<Post> {
        return postApiService.addPost(post)
    }

    override suspend fun deletePost(postId: Int): NetworkResult<DeletedPost> {
        return postApiService.deletePost(postId)
    }

    override suspend fun updatePost(post: Post): NetworkResult<Post> {
        return postApiService.updatePost(post)
    }
}