package com.dotaanalytics.controller

import com.dotaanalytics.domain.HeroSearchCriteria
import com.dotaanalytics.service.HeroService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/heroes")
class HeroController(private val heroService: HeroService) {

    @GetMapping
    fun heroSearch(
        @RequestParam(required = false) query: String?,
        model: Model
    ): String {
        val heroes = if (!query.isNullOrBlank()) {
            heroService.search(HeroSearchCriteria(query))
        } else {
            heroService.getHeroes()
        }

        model.addAttribute("heroes", heroes)
        model.addAttribute("query", query ?: "")

        return "heroes/search"
    }
}