package com.kgmyshin.kmm.viewmodel.sample.ui.support

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

abstract class ViewModel(val coroutineScope: CoroutineScope) {
    open fun onLaunch() {}

    open fun onDispose() {
        coroutineScope.cancel()
    }
}