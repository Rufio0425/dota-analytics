package com.dotaanalytics.dto

data class HeroDto(
    val id: Int,
    val name: String,
    val localizedName: String,
    val primaryAttr: String,
    val attackType: String,
    val roles: List<String>
)