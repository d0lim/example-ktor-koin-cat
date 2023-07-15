package com.leg3nd.domain.core.service

import com.leg3nd.domain.port.api.CatServicePort
import com.leg3nd.domain.port.database.CatDatabasePort
import org.koin.core.annotation.Single

@Single
class CatServiceImpl(
    private val catDatabasePort: CatDatabasePort,
) : CatServicePort {
    override fun getAllCatNames(): List<String> =
        catDatabasePort.findAll()
            .map { it.name }
}
