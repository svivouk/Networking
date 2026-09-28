package ua.melnyk.networking.domain.posts.edit

import ua.melnyk.networking.data.common.Result
import ua.melnyk.networking.data.posts.model.responces.Post
import ua.melnyk.networking.domain.posts.PostRepository

internal class EditUseCase(
    private val postRepository: PostRepository,
) {
    suspend operator fun invoke(post: Post): Result<String> {
        return postRepository.updatePost(post)
    }
}