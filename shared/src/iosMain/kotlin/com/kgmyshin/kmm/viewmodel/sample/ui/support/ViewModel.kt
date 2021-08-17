package com.kgmyshin.kmm.viewmodel.sample.ui.support

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

fun <T : ViewModel> createViewModel(viewModelFactory: ViewModelFactory<T>): T =
    viewModelFactory.create(
        CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    )