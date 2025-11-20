package com.dotaanalytics.client

import com.dotaanalytics.dto.HeroDto
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

@Service
class OpenDotaApiClient(private val webClient: WebClient) {
    fun fetchHeroes(): List<HeroDto> {
        return try {
            webClient.get()
                .uri("/heroes")
                .retrieve()
                .bodyToFlux(HeroDto::class.java)
                .collectList()
                .block() ?: emptyList()
        } catch (e: Exception) {
            emptyList()
        }
    }
}