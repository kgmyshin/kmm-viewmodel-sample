package com.kgmyshin.kmm.viewmodel.sample.domain

import org.koin.dsl.module

internal val domainModule = module {
    single { PersonRepository() }
}