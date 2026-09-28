package ua.melnyk.networking.domain.posts.remove

import ua.melnyk.networking.data.common.Result
import ua.melnyk.networking.domain.posts.PostRepository

internal class RemovePostUseCase(
    private val postRepository: PostRepository
) {
    suspend operator fun invoke(postId: Int): Result<String> {
        return postRepository.deletePost(postId)
    }

}