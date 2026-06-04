package ua.melnyk.networking.data.posts.model.responces

import kotlinx.serialization.Serializable

@Serializable
internal data class Reactions(
    val likes: Int = 0,
    val dislikes: Int = 0
) {
}