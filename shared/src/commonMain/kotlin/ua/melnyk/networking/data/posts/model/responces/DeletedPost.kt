package ua.melnyk.networking.data.posts.model.responces

import kotlinx.serialization.Serializable

@Serializable
internal data class DeletedPost (
    val id: Int,
    val userId: Int,
    val body: String,
    val reactions: Reactions,
    val tags: List<String>,
    val isDeleted: Boolean,
    val deletedOn: String,
    val views: Int = 0,
)