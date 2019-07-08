package com.example.koindemo.di

import com.example.koindemo.main.MainViewModel
import org.koin.android.experimental.dsl.viewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { (id: String) -> MainViewModel(id) }


}