package com.leg3nd.application

import com.leg3nd.domain.port.api.CatServicePort
import org.koin.core.annotation.Single

@Single
class CatController(
    private val catServicePort: CatServicePort,
) {
    fun getAllCatNames(): List<String> =
        catServicePort.getAllCatNames()
}
