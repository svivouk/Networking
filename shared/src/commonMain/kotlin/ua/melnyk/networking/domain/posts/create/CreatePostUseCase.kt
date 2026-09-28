package ua.melnyk.networking.domain.posts.create

import ua.melnyk.networking.data.common.Result
import ua.melnyk.networking.data.posts.model.requests.NewPost
import ua.melnyk.networking.domain.posts.PostRepository

internal class CreatePostUseCase(
    private val postRepository: PostRepository,
) {
    suspend operator fun invoke(post: NewPost): Result<String> {
        return postRepository.addPost(post)
    }
}