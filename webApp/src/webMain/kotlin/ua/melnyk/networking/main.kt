package ua.melnyk.networking

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import ua.melnyk.networking.di.initKoin
import ua.melnyk.networking.presentation.App

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    initKoin {
        printLogger()
    }
    ComposeViewport {
        App()
    }
}