package com.pankajkcodes.viewmodelkotlin

import androidx.lifecycle.ViewModel

class MainViewModel(private val initialValue: Int) : ViewModel(){

    var count = initialValue

    fun increment(){
        count++
    }
}