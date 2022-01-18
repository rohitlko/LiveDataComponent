package com.rohit.livedatacomponent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val factLiveDataObject = MutableLiveData<String>("This is a fact")

    val factLiveData: LiveData<String>
        get() = factLiveDataObject

    fun updateLiveDataOnClick() {
        factLiveDataObject.value = "This a new fact"
    }
}