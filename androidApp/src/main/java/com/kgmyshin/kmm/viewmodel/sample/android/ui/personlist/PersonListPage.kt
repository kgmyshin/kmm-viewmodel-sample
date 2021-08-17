package com.kgmyshin.kmm.viewmodel.sample.android.ui.personlist

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

    PersonListTemplate(personList = personList, onClickDelete = viewModel::onClickDelete)
}