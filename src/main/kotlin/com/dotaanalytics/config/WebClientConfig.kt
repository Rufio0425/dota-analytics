package com.dotaanalytics.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfig {
    @Bean
    fun webClient(): WebClient {
        return WebClient.builder()
            .baseUrl("https://api.opendota.com/api")
            .codecs { it.defaultCodecs().maxInMemorySize(1 * 1024 * 1024) }
            .build()
    }
}