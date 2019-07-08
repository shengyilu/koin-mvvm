package com.example.koindemo

import android.app.Application
import com.example.koindemo.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import java.util.logging.Level

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(org.koin.core.logger.Level.DEBUG)
            androidContext(this@MainApplication)
            androidFileProperties()
            modules(listOf(viewModelModule))
        }
    }
}