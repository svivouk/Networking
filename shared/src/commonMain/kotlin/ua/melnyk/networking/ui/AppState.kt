package ua.melnyk.networking.ui

import androidx.compose.runtime.Immutable
import ua.melnyk.networking.data.posts.model.responces.Post

@Immutable
internal data class AppState(
    val isProgressVisible: Boolean = false,
    val posts: List<Post> = emptyList(),
    val result: String? = null,
    val error: String? = null
) {
}