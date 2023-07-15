package com.leg3nd.domain.port.database

import com.leg3nd.domain.core.model.Cat

interface CatDatabasePort {

    fun findAll(): List<Cat>
}
