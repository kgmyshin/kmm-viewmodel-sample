package com.kgmyshin.kmm.viewmodel.sample.android

import android.app.Application
import com.kgmyshin.kmm.viewmodel.sample.commonModules
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(commonModules)
        }
    }
}