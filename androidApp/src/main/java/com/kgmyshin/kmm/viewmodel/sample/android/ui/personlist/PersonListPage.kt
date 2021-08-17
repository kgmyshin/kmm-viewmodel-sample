package com.kgmyshin.kmm.viewmodel.sample.android.ui.personlist

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonListViewModelFactory
import com.kgmyshin.kmm.viewmodel.viewmodel.ktx.rememberViewModel

@Composable
fun PersonListPage(viewModelFactory: PersonListViewModelFactory) {
    val viewModel =
        rememberViewModel(viewModelFactory = viewModelFactory)
    val personList by viewModel.personListStateFlow.collectAsState()

    val event by viewModel.singleLaunchEvent.collectAsState()

    if (event?.getContentIfNotHandled() != null) {
        Log.d("debug-log", "ダイアログopenなど")
    }

    PersonListTemplate(personList = personList, onClickDelete = viewModel::onClickDelete)
}