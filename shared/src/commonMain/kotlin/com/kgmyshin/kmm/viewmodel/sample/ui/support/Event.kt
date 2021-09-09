package com.kgmyshin.kmm.viewmodel.sample.ui.support

open class Event<out T>(private val content: T) {
    var handled = false
        private set

    fun getContentIfNotHandled(): T? = if (handled) {
        null
    } else {
        handled = true
        content
    }

    fun peekContent(): T = content
}