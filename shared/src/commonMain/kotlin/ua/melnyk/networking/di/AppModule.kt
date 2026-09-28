package ua.melnyk.networking.di


import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ua.melnyk.networking.data.posts.service.AppPostApiService
import ua.melnyk.networking.data.posts.service.PostApiService
import ua.melnyk.networking.data.posts.AppPostRepository
import ua.melnyk.networking.domain.posts.PostRepository
import ua.melnyk.networking.domain.posts.create.CreatePostUseCase
import ua.melnyk.networking.domain.posts.edit.EditUseCase
import ua.melnyk.networking.domain.posts.obtain.ObtainPostsUseCase
import ua.melnyk.networking.domain.posts.remove.RemovePostUseCase
import ua.melnyk.networking.presentation.AppViewModel

val networkModule = module {
    single {
        HttpClient {
            install(Logging) {
                level = LogLevel.ALL
                logger = object : Logger {
                    override fun log(message: String) {
                        println("KtorLogger: $message")
                    }
                }
            }
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }
        }
    }

    singleOf(::AppPostApiService) { bind<PostApiService>() }
}
val appModule = module {
    includes(networkModule)
    singleOf(::AppPostRepository) { bind<PostRepository>() }
    factoryOf(::CreatePostUseCase)
    factoryOf(::EditUseCase)
    factoryOf(::ObtainPostsUseCase)
    factoryOf(::RemovePostUseCase)
    viewModelOf(::AppViewModel)
}