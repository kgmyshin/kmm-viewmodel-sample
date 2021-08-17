package com.kgmyshin.kmm.viewmodel.sample.ui.person

import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModelFactory
import com.kgmyshin.kmm.viewmodel.sample.usecase.GetPersonUseCase
import kotlinx.coroutines.CoroutineScope

class PersonViewModelFactory(
    private val id: PersonId,
    private val getPersonUseCase: GetPersonUseCase
) : ViewModelFactory<PersonViewModel> {
    override fun create(coroutineScope: CoroutineScope): PersonViewModel =
        PersonViewModel(
            id,
            getPersonUseCase,
            coroutineScope
        )
}