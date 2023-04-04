package com.example.m6_hw3.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var variable = 0
    val _count: MutableLiveData<String> = MutableLiveData()

    private var operation = ""
    val _operation : MutableLiveData<String> = MutableLiveData()

    fun increment() {
        variable++
        _count.value = variable.toString()
        _operation.value = "\n + $operation"

    }

    fun discrement() {
        variable--
        _count.value = variable.toString()
        _operation.value = "\n - $operation"

    }
}

