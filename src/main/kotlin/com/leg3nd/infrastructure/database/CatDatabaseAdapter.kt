package com.leg3nd.infrastructure.database

import com.leg3nd.domain.core.model.Cat
import com.leg3nd.domain.port.database.CatDatabasePort
import com.leg3nd.infrastructure.database.repository.CatRepository
import org.koin.core.annotation.Single

@Single
class CatDatabaseAdapter(
    private val catRepository: CatRepository,
) : CatDatabasePort {
    override fun findAll(): List<Cat> =
        catRepository.findAll()
            .map { it.toDomain() }
}
