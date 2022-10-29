package com.example

import com.example.models.ApiResponse
import com.example.repository.HeroRepository
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.koin.java.KoinJavaComponent.inject
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
            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
            val expected = ApiResponse(
                success = true,
                message = "ok",
                prevPage = null,
                nextPage = 1,
                heroes = heroRepository.heroes[0],
                lastUpdated = actual.lastUpdated
            )

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
                    val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                    val expected = ApiResponse(
                        success = true,
                        message = "ok",
                        prevPage = calculatePrevPage(page),
                        nextPage = calculateNextPage(page, heroes.size),
                        heroes = heroes[page],
                        lastUpdated = actual.lastUpdated
                    )

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

    @Test
    fun `access all heroes endpoint, query non existing page number, assert error`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/fma/heroes?page=5").apply {
            assertEquals(
                expected = HttpStatusCode.NotFound,
                actual = status
            )
            val expected = "404: Page Not Found"

            val actual = bodyAsText()

            assertEquals(
                expected = expected,
                actual = actual
            )
        }
    }

    @Test
    fun `access all heroes endpoint, query invalid page number, assert error`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/fma/heroes?page=invalid").apply {
            assertEquals(
                expected = HttpStatusCode.BadRequest,
                actual = status
            )
            val expected = ApiResponse(
                success = false,
                message = "Only numbers allowed in page query param."
            )

            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())

            assertEquals(
                expected = expected,
                actual = actual
            )
        }
    }

    @Test
    fun `access search heroes endpoint, query hero name, assert single hero result`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/fma/heroes/search?name=mustang").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )

            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                .heroes.size
            assertEquals(
                expected = 1,
                actual = actual
            )
        }
    }

    @Test
    fun `access search heroes endpoint, query hero name, assert multipe heroes result`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/fma/heroes/search?name=el").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )

            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                .heroes.size
            assertEquals(
                expected = 3,
                actual = actual
            )
        }
    }

    @Test
    fun `access search heroes endpoint, query an empty text, assert empty list as a result`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/fma/heroes/search?name=").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )

            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                .heroes
            assertEquals(
                expected = emptyList(),
                actual = actual
            )
        }
    }

    @Test
    fun `access search heroes endpoint, query non existing hero, assert empty list as a result`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/fma/heroes/search?name=naruto").apply {
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = status
            )

            val actual = Json.decodeFromString<ApiResponse>(bodyAsText())
                .heroes
            assertEquals(
                expected = emptyList(),
                actual = actual
            )
        }
    }

    @Test
    fun `access non existing endpoint, assert not found`() = testApplication {
        environment {
            developmentMode = false
        }

        client.get("/unknown").apply {
            assertEquals(
                expected = HttpStatusCode.NotFound,
                actual = status
            )
            assertEquals(
                expected = "404: Page Not Found",
                actual = bodyAsText()
            )
        }
    }

}