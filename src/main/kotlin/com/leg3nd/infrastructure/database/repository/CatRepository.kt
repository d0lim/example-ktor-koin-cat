package com.leg3nd.infrastructure.database.repository

import com.leg3nd.infrastructure.database.repository.entity.CatEntity
import org.koin.core.annotation.Single

@Single
class CatRepository {

    private val cats = listOf(
        CatEntity(1, "choco", 3),
        CatEntity(2, "lucky", 1),
        CatEntity(3, "nya-ong-yi", 4),
    )

    fun findAll(): List<CatEntity> = cats
}
