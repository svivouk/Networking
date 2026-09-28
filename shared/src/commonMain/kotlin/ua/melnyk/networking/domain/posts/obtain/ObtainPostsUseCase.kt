package ua.melnyk.networking.domain.posts.obtain

import ua.melnyk.networking.data.common.Result
import ua.melnyk.networking.data.posts.model.responces.Posts
import ua.melnyk.networking.domain.posts.PostRepository

internal class ObtainPostsUseCase(
    private val postRepository: PostRepository,
) {
    suspend operator fun invoke(): Result<Posts> {
        return postRepository.getAllPost()
    }
}