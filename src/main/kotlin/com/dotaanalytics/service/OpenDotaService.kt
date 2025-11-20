package com.dotaanalytics.service

import com.dotaanalytics.dto.HeroDto

interface OpenDotaService {
    fun getHeroes(): List<HeroDto>
}