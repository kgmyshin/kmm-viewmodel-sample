package com.kgmyshin.kmm.viewmodel.sample

import com.kgmyshin.kmm.viewmodel.sample.domain.domainModule
import com.kgmyshin.kmm.viewmodel.sample.ui.uiModule
import com.kgmyshin.kmm.viewmodel.sample.usecase.useCaseModule

val commonModules = listOf(
    uiModule,
    domainModule,
    useCaseModule
)