package com.leg3nd.plugins

import com.leg3nd.application.CatController
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause", status = io.ktor.http.HttpStatusCode.InternalServerError)
        }
    }

    val catController by inject<CatController>()

    routing {
        get("/cats/name") {
            call.respond(catController.getAllCatNames())
        }
    }
}
