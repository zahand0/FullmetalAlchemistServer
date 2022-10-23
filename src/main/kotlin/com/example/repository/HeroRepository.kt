package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

interface HeroRepository {

    val heroes: Map<Int, List<Hero>>
    suspend fun getAllHeroes(page: Int = 1): ApiResponse

    suspend fun searchHeroes(name: String): ApiResponse

}