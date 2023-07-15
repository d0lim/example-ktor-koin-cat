package com.leg3nd

import com.leg3nd.plugins.KoinModule
import com.leg3nd.plugins.configureHTTP
import com.leg3nd.plugins.configureRouting
import com.leg3nd.plugins.configureSecurity
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import org.koin.dsl.module
import org.koin.ksp.generated.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    install(Koin) {
        slf4jLogger()
        modules(KoinModule().module)
    }
    configureHTTP()
    configureSecurity()
    configureRouting()
}
