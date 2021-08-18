//
//  ViewModel+SwiftUI.swift
//  iosApp
//
//  Created by 釘宮愼之介 on 2021/08/18.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI
import shared

extension ViewModel {
    func collectAsState<T>(flow: Kotlinx_coroutines_coreStateFlow) -> FlowState<T> {
        return FlowState(viewModel: self, flow: flow)
    }
}

class FlowState<T> : ObservableObject {
    @Published var value: T? = nil
    init(viewModel: ViewModel, flow: Kotlinx_coroutines_coreStateFlow) {
        viewModel.collect(
            flow: flow,
            onEach: { [weak self] new in
                self?.value = (new as! T)
            },
            onCompletion: {},
            onError: { _ in }
        )
    }
}
