package com.dotaanalytics.dto

import java.math.BigDecimal
import java.util.*

data class HeroStatsDto(
    val id: UUID,
    val heroId: UUID,
    val opendotaHeroId: Int,
    val totalMatches: Long,
    val totalWins: Long,
    val winRate: BigDecimal?,
    val pickRate: BigDecimal?,
    val banRate: BigDecimal?,
    val avgKills: BigDecimal?,
    val avgDeaths: BigDecimal?,
    val avgAssists: BigDecimal?,
    val avgLastHits: BigDecimal?,
    val avgDenies: BigDecimal?,
    val avgGpm: BigDecimal?,
    val avgXpm: BigDecimal?,
    val avgHeroDamage: BigDecimal?,
    val avgTowerDamage: BigDecimal?,
    val avgHeroHealing: BigDecimal?
)

data class HeroWithStatsDto(
    val hero: HeroDto,
    val stats: HeroStatsDto?
)