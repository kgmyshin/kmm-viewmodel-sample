package com.kgmyshin.kmm.viewmodel.sample.ui.support

import kotlinx.coroutines.CoroutineScope

interface ViewModelFactory<T : ViewModel> {
    fun create(coroutineScope: CoroutineScope): T
}