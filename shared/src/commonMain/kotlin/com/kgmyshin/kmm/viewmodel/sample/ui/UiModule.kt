package com.kgmyshin.kmm.viewmodel.sample.ui

import com.kgmyshin.kmm.viewmodel.sample.ui.person.PersonViewModelFactory
import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonListViewModelFactory
import org.koin.dsl.module

internal val uiModule = module {
    factory { PersonListViewModelFactory(get(), get()) }

    // val viewModelFactory: PersonViewModelFactory by inject { parametersOf(personId) } という形でinjectできる
    factory { params -> PersonViewModelFactory(params.get(), get()) }
}