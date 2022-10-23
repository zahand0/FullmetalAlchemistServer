package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id: Int,
    val name: String,
    val image: String,
    val memorableQuotes: List<String>,
    val alias: String,
    val rating: Double,
    val about: String,
    val species: Species,
    val militaryRank: MilitaryRank,
    val abilities: List<String>,
    val weapons: List<String>
)
