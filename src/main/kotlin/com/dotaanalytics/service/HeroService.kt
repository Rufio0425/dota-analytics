package com.dotaanalytics.service

import com.dotaanalytics.client.OpenDotaApiClient
import com.dotaanalytics.domain.HeroSearchCriteria
import com.dotaanalytics.dto.HeroDto
// import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class HeroService(
    private val openDotaApiClient: OpenDotaApiClient
) : OpenDotaService {

    // @Cacheable("heroes")
    override fun getHeroes(): List<HeroDto> {
        return openDotaApiClient.fetchHeroes()
    }

    fun search(criteria: HeroSearchCriteria): List<HeroDto> {
        val allHeroes = getHeroes()

        return allHeroes.filter { hero ->
            hero.localizedName.contains(criteria.query, ignoreCase = true) ||
            hero.name.contains(criteria.query, ignoreCase = true)
        }
    }
}