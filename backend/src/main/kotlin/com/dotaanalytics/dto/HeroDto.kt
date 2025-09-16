package com.dotaanalytics.dto

import java.util.*

data class HeroDto(
    val id: UUID,
    val opendotaId: Int,
    val name: String,
    val localizedName: String,
    val primaryAttr: String,
    val attackType: String,
    val roles: List<String>,
    val img: String?,
    val icon: String?,
    val baseHealth: Int?,
    val baseHealthRegen: Double?,
    val baseMana: Int?,
    val baseManaRegen: Double?,
    val baseArmor: Double?,
    val baseMr: Int?,
    val baseAttackMin: Int?,
    val baseAttackMax: Int?,
    val baseStr: Int?,
    val baseAgi: Int?,
    val baseInt: Int?,
    val strGain: Double?,
    val agiGain: Double?,
    val intGain: Double?,
    val attackRange: Int?,
    val projectileSpeed: Int?,
    val moveSpeed: Int?,
    val turnRate: Double?,
    val cmEnabled: Boolean,
    val legs: Int?,
    val dayVision: Int?,
    val nightVision: Int?
)