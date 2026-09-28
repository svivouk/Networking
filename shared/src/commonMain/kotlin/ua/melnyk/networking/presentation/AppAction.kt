package ua.melnyk.networking.presentation

sealed class AppAction{
    data object OnFetchPosts: AppAction()
    data object OnCreatePosts: AppAction()
    data object OnDeletePosts: AppAction()
    data object OnUpdatePosts: AppAction()
}
