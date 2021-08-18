package com.kgmyshin.kmm.viewmodel.sample.ui.person

import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModel
import com.kgmyshin.kmm.viewmodel.sample.usecase.GetPersonUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PersonViewModel(
    private val id: PersonId,
    private val getPersonUseCase: GetPersonUseCase,
    coroutineScope: CoroutineScope
) : ViewModel(coroutineScope) {
    private val _personStateFlow: MutableStateFlow<PersonUiModel?> = MutableStateFlow(null)
    val personStateFlow: StateFlow<PersonUiModel?>
        get() = _personStateFlow

    override fun onLaunch() {
        super.onLaunch()
        coroutineScope.launch {
            _personStateFlow.value =
                getPersonUseCase.execute(id)?.let { PersonConverter.convert(it) }
        }
    }
}