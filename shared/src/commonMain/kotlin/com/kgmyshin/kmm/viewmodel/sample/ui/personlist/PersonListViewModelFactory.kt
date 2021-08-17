package com.kgmyshin.kmm.viewmodel.sample.ui.personlist

import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModelFactory
import com.kgmyshin.kmm.viewmodel.sample.usecase.DeletePersonUseCase
import com.kgmyshin.kmm.viewmodel.sample.usecase.GetPersonListUseCase
import kotlinx.coroutines.CoroutineScope

class PersonListViewModelFactory(
    private val getPersonListUseCase: GetPersonListUseCase,
    private val deletePersonUseCase: DeletePersonUseCase
) : ViewModelFactory<PersonListViewModel> {
    override fun create(coroutineScope: CoroutineScope): PersonListViewModel =
        PersonListViewModel(
            getPersonListUseCase,
            deletePersonUseCase,
            coroutineScope
        )
}