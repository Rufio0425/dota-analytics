package com.dotaanalytics.client

import com.dotaanalytics.dto.HeroDto
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class OpenDotaApiClientTest {

    @Autowired
    private lateinit var openDotaApiClient: OpenDotaApiClient

    @Test
    fun `should fetch heroes from OpenDota API`() {
        // When
        val heroes = openDotaApiClient.fetchHeroes()

        // Then
        println("Fetched ${heroes.size} heroes")
        heroes.take(5).forEach { hero ->
            println("Hero: ${hero.name} (${hero.localizedName}) - ${hero.primaryAttr} ${hero.attackType}")
        }

        // Basic validation
        assert(heroes.isNotEmpty()) { "Should fetch at least one hero" }
        heroes.forEach { hero ->
            assert(hero.id > 0) { "Hero ID should be positive" }
            assert(hero.name.isNotBlank()) { "Hero name should not be blank" }
            assert(hero.localizedName.isNotBlank()) { "Hero localized name should not be blank" }
        }
    }
}