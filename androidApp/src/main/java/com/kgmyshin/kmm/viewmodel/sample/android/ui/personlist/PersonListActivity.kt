package com.kgmyshin.kmm.viewmodel.sample.android.ui.personlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonListViewModelFactory
import org.koin.android.ext.android.inject

class PersonListActivity : ComponentActivity() {
    private val viewModelFactory: PersonListViewModelFactory by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonListPage(viewModelFactory = viewModelFactory)
        }
    }
}