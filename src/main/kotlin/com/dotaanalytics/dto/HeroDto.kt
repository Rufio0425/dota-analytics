package com.dotaanalytics.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class HeroDto(
    val id: Int,
    val name: String,
    @JsonProperty("localized_name")
    val localizedName: String,
    @JsonProperty("primary_attr")
    val primaryAttr: String,
    @JsonProperty("attack_type")
    val attackType: String,
    val roles: List<String>
)