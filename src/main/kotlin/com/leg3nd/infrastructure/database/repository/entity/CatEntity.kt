package com.leg3nd.infrastructure.database.repository.entity

import com.leg3nd.domain.core.model.Cat

class CatEntity(
    val id: Long,
    val name: String,
    val age: Long,
) {
    fun toDomain(): Cat =
        Cat(
            name = this.name,
            age = this.age,
        )
}
