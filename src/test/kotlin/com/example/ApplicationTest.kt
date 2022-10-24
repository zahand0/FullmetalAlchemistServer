package com.example

import com.example.di.koinModule
import com.example.models.ApiResponse
import com.example.models.Hero
import com.example.repository.HeroRepository
import com.example.repository.HeroRepositoryImpl
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.inject
import org.koin.test.KoinTest
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    private val heroRepository: HeroRepository by inject(HeroRepository::class.java)


    @Test
    fun `access root endpoint, assert correct information`() = testApplication {
        client.get("/").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )
            assertEquals(
                expected = "Welcome to Fullmetal Alchemist API",
                actual = bodyAsText()
            )
        }
    }

    @Test
    fun `access all heroes endpoint, assert correct information`() = testApplication {
        environment {
            developmentMode = false
        }


        client.get("/fma/heroes").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = null,
                nextPage = 1,
                heroes = heroRepository.heroes[0]
            )
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())

            assertEquals(
                expected = expected,
                actual = actual
            )
        }
    }

    @Test
    fun `access all heroes endpoint, query all pages, assert correct information`() = testApplication {
        environment {
            developmentMode = false
        }
        client.get("").apply {
            val pages = heroRepository.heroes.indices
            val heroes = heroRepository.heroes

            pages.forEach { page ->
                println("CURRENT PAGE: $page")
                client.get("/fma/heroes?page=$page").apply {
                    assertEquals(
                        expected = HttpStatusCode.OK,
                        actual = status
                    )
                    val expected = ApiResponse(
                        success = true,
                        message = "ok",
                        prevPage = calculatePrevPage(page),
                        nextPage = calculateNextPage(page, heroes.size),
                        heroes = heroes[page]
                    )
                    val actual = Json.decodeFromString<ApiResponse>(bodyAsText())

                    assertEquals(
                        expected = expected,
                        actual = actual
                    )
                }
            }
        }


    }

    private fun calculatePrevPage(page: Int): Int? {
        return if (page > 0) page - 1 else null
    }

    private fun calculateNextPage(page: Int, maxPages: Int): Int? {
        return if (page < maxPages - 1) page + 1 else null
    }

}