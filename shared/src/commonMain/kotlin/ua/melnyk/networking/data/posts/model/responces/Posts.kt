package ua.melnyk.networking.data.posts.model.responces

import kotlinx.serialization.Serializable

@Serializable
internal data class Posts(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
) {
}