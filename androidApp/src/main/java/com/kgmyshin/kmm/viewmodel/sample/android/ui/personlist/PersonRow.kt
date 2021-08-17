package com.kgmyshin.kmm.viewmodel.sample.android.ui.personlist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.ui.personlist.PersonUiModel

@Composable
fun PersonRow(
    uiModel: PersonUiModel,
    onClickDelete: (PersonId) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { onClickDelete(uiModel.id) })
            .padding(16.dp)
    ) {
        Text(text = uiModel.name)
    }
}

@Preview
@Composable
fun PersonRowPreview() {
    PersonRow(
        PersonUiModel(
            PersonId(""),
            "MyName"
        )
    ) {}
}