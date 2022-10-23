package com.example.repository

import com.example.data.heroesList
import com.example.models.ApiResponse
import com.example.models.Hero
import com.example.models.MilitaryRank

class HeroRepositoryImpl: HeroRepository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
           1 to heroesList.subList(0, 4),
           2 to heroesList.subList(4, 8),
           3 to heroesList.subList(8, 12),
           4 to heroesList.subList(12, 16),
           5 to heroesList.subList(16, 20)
        )
    }

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchHeroes(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}