package com.dotaanalytics.mapper

import com.dotaanalytics.model.Hero
import org.apache.ibatis.annotations.Mapper

@Mapper
interface HeroMapper {
    fun getAllHeroes(): List<Hero>
}