package com.dotaanalytics.model

import java.util.*

data class Hero(
    val id: UUID,
    val opendotaId: Int,
    val name: String,
    val localizedName: String,
    val primaryAttr: String,
    val attackType: String,
    val roles: String  // JSON string for now
)