package com.example.koindemo.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.koindemo.R
import org.koin.android.viewmodel.ext.android.getViewModel
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by viewModel {
        parametersOf("MainActivityViewModel")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

    }
}
