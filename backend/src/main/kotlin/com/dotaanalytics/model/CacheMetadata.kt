package com.dotaanalytics.model

import java.time.LocalDateTime
import java.util.*

data class CacheMetadata(
    val id: UUID? = null,
    val cacheKey: String,
    val cacheType: String,
    val lastUpdated: LocalDateTime,
    val expiresAt: LocalDateTime,
    val isValid: Boolean = true,
    val createdAt: LocalDateTime? = null
)