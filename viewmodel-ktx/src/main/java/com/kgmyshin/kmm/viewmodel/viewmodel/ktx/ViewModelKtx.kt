package com.kgmyshin.kmm.viewmodel.viewmodel.ktx

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModel
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModelFactory

@Composable
fun <T : ViewModel> rememberViewModel(
    viewModelFactory: ViewModelFactory<T>
): T {
    val coroutineScope = rememberCoroutineScope()
    val wrapper = remember {
        CompositionViewModelCanceller(viewModelFactory.create(coroutineScope))
    }
    return wrapper.viewModel
}