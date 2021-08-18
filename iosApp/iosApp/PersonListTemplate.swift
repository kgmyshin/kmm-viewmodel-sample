//
//  PersonListTemplate.swift
//  iosApp
//
//  Created by 釘宮愼之介 on 2021/08/18.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI
import shared

struct PersonListTemplate: View {
    
    let personList: [PersonUiModel]
    let onClickDelete: (PersonId) -> ()
    
    init(personList: [PersonUiModel], onClickDelete: @escaping (PersonId) -> ()) {
        self.personList = personList
        self.onClickDelete = onClickDelete
    }
    
    var body: some View {
        List {
            ForEach(personList, id: \.self) { person in
                Text(person.name).onTapGesture {
                    onClickDelete(person.id)
                }
            }
        }
    }
}
