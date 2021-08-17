package com.kgmyshin.kmm.viewmodel.sample.ui.personlist

import com.kgmyshin.kmm.viewmodel.sample.domain.Person

object PersonConverter {
    fun convert(domainModel: Person): PersonUiModel = PersonUiModel(
        domainModel.id,
        domainModel.name
    )
}