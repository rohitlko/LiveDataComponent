package com.rohit.livedatacomponent

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val factLiveData = MutableLiveData<String>("This is a fact")

     fun updateLiveDataOnClick(){
         factLiveData.value = "This a a new fact"
     }
}