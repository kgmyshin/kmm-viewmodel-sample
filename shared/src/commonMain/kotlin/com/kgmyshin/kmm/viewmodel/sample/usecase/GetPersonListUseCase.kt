package com.kgmyshin.kmm.viewmodel.sample.usecase

import com.kgmyshin.kmm.viewmodel.sample.domain.PersonRepository
import com.kgmyshin.kmm.viewmodel.sample.domain.Person

class GetPersonListUseCase(
    private val repository: PersonRepository
) {
    suspend fun execute(): List<Person> = repository.findAll()
}