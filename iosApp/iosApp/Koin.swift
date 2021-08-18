//
//  Koin.swift
//  iosApp
//
//  Created by 釘宮愼之介 on 2021/08/18.
//  Copyright © 2021 orgName. All rights reserved.
//

import Foundation
import shared

private var _koin: Koin_coreKoin? = nil
var koin: Koin_coreKoin {
    return _koin!
}

func startKoin() {
    let koinApplication = KoinKt.doInitKoin()
    _koin = koinApplication.koin
}
