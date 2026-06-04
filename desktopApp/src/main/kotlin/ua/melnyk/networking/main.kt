package ua.melnyk.networking

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ua.melnyk.networking.di.initKoin
import ua.melnyk.networking.ui.App

fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Networking",
    ) {
        App()
    }
}