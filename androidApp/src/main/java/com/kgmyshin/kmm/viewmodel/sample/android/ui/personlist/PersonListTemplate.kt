package com.kgmyshin.kmm.viewmodel.sample.android.ui.personlist

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonUiModel

@Composable
fun PersonListTemplate(
    personList: List<PersonUiModel>,
    onClickDelete: (PersonId) -> Unit
) {
    Column {
        personList.forEach {
            PersonRow(uiModel = it, onClickDelete = onClickDelete)
        }
    }
}

@Preview
@Composable
fun PersonListTemplatePreview() {
    PersonListTemplate(
        listOf(
            PersonUiModel(
                PersonId("1"),
                "His"
            ),
            PersonUiModel(
                PersonId("1"),
                "Her"
            )
        )
    ) {}
}