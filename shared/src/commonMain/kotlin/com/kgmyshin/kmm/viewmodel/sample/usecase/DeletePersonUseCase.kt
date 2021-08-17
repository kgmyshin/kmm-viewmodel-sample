package com.kgmyshin.kmm.viewmodel.sample.usecase

import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.domain.PersonRepository

class DeletePersonUseCase(
    private val repository: PersonRepository
) {
    suspend fun execute(id: PersonId) = repository.deleteById(id)
}