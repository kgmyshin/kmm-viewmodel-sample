import SwiftUI
import shared

struct PersonListPage: View {
    var viewModel: PersonListViewModel
    
    @ObservedObject var personList: FlowState<[PersonUiModel]>
    
    init() {
        let factory = koin.get(objCClass: PersonListViewModelFactory.self) as! PersonListViewModelFactory
        self.viewModel = ViewModelKt.createViewModel(viewModelFactory: factory) as! PersonListViewModel
        self.personList = self.viewModel.collectAsState(flow: self.viewModel.personListStateFlow)
    }
    
    var body: some View {
        PersonListTemplate(
            personList: self.personList.value ?? [], onClickDelete: { id in
                self.viewModel.onClickDelete(id: id)
            }
        ).onAppear(perform: {
            viewModel.onLaunched()
        })
        .onDisappear(perform: {
            viewModel.onDispose()
        })
    }
}
