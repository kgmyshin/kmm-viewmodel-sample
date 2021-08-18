package com.kgmyshin.kmm.viewmodel.sample.ui.personlist

import com.kgmyshin.kmm.viewmodel.sample.domain.PersonId
import com.kgmyshin.kmm.viewmodel.sample.ui.support.ViewModel
import com.kgmyshin.kmm.viewmodel.sample.usecase.DeletePersonUseCase
import com.kgmyshin.kmm.viewmodel.sample.usecase.GetPersonListUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PersonListViewModel(
    private val getPersonListUseCase: GetPersonListUseCase,
    private val deletePersonUseCase: DeletePersonUseCase,
    coroutineScope: CoroutineScope
) : ViewModel(coroutineScope) {

    private val _singleLaunchEvent: MutableStateFlow<TwoSecondEvent?> = MutableStateFlow(null)
    val singleLaunchEvent: StateFlow<TwoSecondEvent?>
        get() = _singleLaunchEvent

    private val _personListStateFlow: MutableStateFlow<List<PersonUiModel>> =
        MutableStateFlow(emptyList())
    val personListStateFlow: StateFlow<List<PersonUiModel>>
        get() = _personListStateFlow

    override fun onLaunch() {
        super.onLaunch()
        coroutineScope.launch {
            _personListStateFlow.value =
                getPersonListUseCase.execute().map { PersonConverter.convert(it) }

            // 2s後にsingle event発火
            delay(2000)
            _singleLaunchEvent.value = TwoSecondEvent()
        }
    }

    fun onClickDelete(id: PersonId) = coroutineScope.launch {
        deletePersonUseCase.execute(id)
        _personListStateFlow.value = _personListStateFlow.value.filterNot { it.id == id }
    }

    override fun onDispose() {
        super.onDispose()
    }
}