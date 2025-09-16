package com.dotaanalytics.model

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

data class HeroStats(
    val id: UUID? = null,
    val heroId: UUID,
    val opendotaHeroId: Int,
    val totalMatches: Long = 0,
    val totalWins: Long = 0,
    val winRate: BigDecimal? = null,
    val pickRate: BigDecimal? = null,
    val banRate: BigDecimal? = null,
    val avgKills: BigDecimal? = null,
    val avgDeaths: BigDecimal? = null,
    val avgAssists: BigDecimal? = null,
    val avgLastHits: BigDecimal? = null,
    val avgDenies: BigDecimal? = null,
    val avgGpm: BigDecimal? = null,
    val avgXpm: BigDecimal? = null,
    val avgHeroDamage: BigDecimal? = null,
    val avgTowerDamage: BigDecimal? = null,
    val avgHeroHealing: BigDecimal? = null,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null
)