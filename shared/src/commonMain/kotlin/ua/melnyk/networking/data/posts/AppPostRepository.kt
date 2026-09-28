package ua.melnyk.networking.data.posts

import ua.melnyk.networking.data.common.Result
import ua.melnyk.networking.data.common.map
import ua.melnyk.networking.data.posts.model.requests.NewPost
import ua.melnyk.networking.data.posts.model.responces.Post
import ua.melnyk.networking.data.posts.model.responces.Posts
import ua.melnyk.networking.data.posts.service.PostApiService
import ua.melnyk.networking.domain.posts.PostRepository

internal class AppPostRepository(
    private val postApiService: PostApiService,
) : PostRepository {

    override suspend fun getAllPost(): Result<Posts> {
        return postApiService.getAllPost()
    }

    override suspend fun addPost(post: NewPost): Result<String> {
        return postApiService.addPost(post).map {
            it.toString()
        }
    }

    override suspend fun updatePost(post: Post): Result<String> {
        return postApiService.updatePost(post).map {
            it.toString()
        }
    }

    override suspend fun deletePost(postId: Int): Result<String> {
        return postApiService.deletePost(postId).map {
            it.toString()
        }
    }
}