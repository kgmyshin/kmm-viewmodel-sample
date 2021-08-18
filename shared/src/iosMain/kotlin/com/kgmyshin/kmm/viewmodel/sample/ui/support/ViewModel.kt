package com.kgmyshin.kmm.viewmodel.sample.ui.support

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

fun <T> ViewModel.collect(
    flow: StateFlow<T>,
    onEach: (T) -> Unit,
    onCompletion: () -> Unit,
    onError: (Throwable) -> Unit
) {
    coroutineScope.launch {
        try {
            flow.collect {
                onEach(it)
            }
            onCompletion()
        } catch (e: Throwable) {
            onError(e)
        }
    }
}

fun <T : ViewModel> createViewModel(viewModelFactory: ViewModelFactory<T>): T =
    viewModelFactory.create(
        CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    )