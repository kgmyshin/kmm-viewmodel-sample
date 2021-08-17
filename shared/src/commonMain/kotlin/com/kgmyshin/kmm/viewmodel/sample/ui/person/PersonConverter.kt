package com.kgmyshin.kmm.viewmodel.sample.ui.person

import com.kgmyshin.kmm.viewmodel.sample.domain.Person

object PersonConverter {
    fun convert(domainModel: Person): PersonUiModel = PersonUiModel(
        domainModel.id,
        domainModel.name
    )
}