package com.example.repository

import com.example.data.heroesList
import com.example.models.ApiResponse
import com.example.models.Hero
import com.example.models.MilitaryRank

class HeroRepositoryImpl : HeroRepository {
    override val heroes: List<List<Hero>> by lazy {
        heroesList.chunked(4)
    }

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePrevPage(page),
            nextPage = calculateNextPage(page),
            heroes[page]
        )
    }

    private fun calculatePrevPage(page: Int): Int? {
        return if (page > 0) page - 1 else null
    }

    private fun calculateNextPage(page: Int): Int? {
        return if (page < heroes.size - 1) page + 1 else null
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(name)
        )
    }

    private fun findHeroes(name: String?): List<Hero> {
        return if (!name.isNullOrBlank())
            heroesList.filter { it.name.lowercase().contains(name.lowercase()) }
        else
            emptyList()
    }
}