package com.example.routes

import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun Route.getAllHeroes() {

    val heroRepository: HeroRepository by inject()

    get("/fma/heroes") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 0

            val maxPageNumber = heroRepository.heroes.size - 1
            require(page in 0..maxPageNumber)

            val apiResponse = heroRepository.getAllHeroes(page = page)

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
        } catch (e: NumberFormatException) {
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Only numbers allowed in page query param."
                ),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = ApiResponse(
                    success = false,
                    message = "Heroes not found."
                ),
                status = HttpStatusCode.NotFound
            )
        }
    }
}