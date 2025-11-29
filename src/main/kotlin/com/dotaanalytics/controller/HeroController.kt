package com.dotaanalytics.controller

import com.dotaanalytics.domain.HeroSearchCriteria
import com.dotaanalytics.service.HeroService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/")
class HeroController(private val heroService: HeroService) {

    @GetMapping
    fun heroPage(
        @RequestParam(required = false) query: String?,
        @RequestParam(required = false) hero: String?,
        model: Model
    ): String {
        // If hero param exists, show hero details
        if (!hero.isNullOrBlank()) {
            val heroDetails = heroService.getHeroByName(hero)
            return if (heroDetails != null) {
                model.addAttribute("hero", heroDetails)
                "heroes/details"
            } else {
                "redirect:/"
            }
        }

        // Otherwise show hero list/search
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