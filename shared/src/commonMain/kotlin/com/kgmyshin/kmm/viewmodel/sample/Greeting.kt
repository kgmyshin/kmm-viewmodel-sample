package com.kgmyshin.kmm.viewmodel.sample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}