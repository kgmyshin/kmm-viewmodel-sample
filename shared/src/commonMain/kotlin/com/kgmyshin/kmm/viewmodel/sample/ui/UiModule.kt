package com.kgmyshin.kmm.viewmodel.sample.ui

import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonListViewModel
import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonListViewModelFactory
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModelFactory
import org.koin.dsl.bind
import org.koin.dsl.module

internal val uiModule = module {
    factory<ViewModelFactory<PersonListViewModel>> {
        PersonListViewModelFactory(
            get(),
            get()
        )
    } bind PersonListViewModelFactory::class
}