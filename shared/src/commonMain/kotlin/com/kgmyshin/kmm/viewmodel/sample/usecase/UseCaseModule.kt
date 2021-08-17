package com.kgmyshin.kmm.viewmodel.sample.usecase

import org.koin.dsl.module

internal val useCaseModule = module {
    factory { DeletePersonUseCase(get()) }
    factory { GetPersonListUseCase(get()) }
}