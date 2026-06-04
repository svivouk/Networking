package ua.melnyk.networking

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform