package com.kgmyshin.kmm.viewmodel.viewmodel.ktx

import androidx.compose.runtime.RememberObserver
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModel

class CompositionViewModelCanceller<T : ViewModel>(
    val viewModel: T
) : RememberObserver {
    override fun onRemembered() {
        viewModel.onLaunch()
    }

    override fun onAbandoned() {
        viewModel.onDispose()
    }

    override fun onForgotten() {
        viewModel.onDispose()
    }
}