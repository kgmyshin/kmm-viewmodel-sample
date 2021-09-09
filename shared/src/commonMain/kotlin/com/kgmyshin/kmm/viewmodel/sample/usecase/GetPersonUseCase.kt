package com.kgmyshin.kmm.viewmodel.sample.usecase

import com.kgmyshin.kmm.viewmodel.sample.domain.Person
import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.domain.PersonRepository

class GetPersonUseCase(private val repository: PersonRepository) {
    suspend fun execute(id: PersonId): Person? = repository.findById(id)
}