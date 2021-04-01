package com.example.testtest.ui.fragments.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testtest.Model


class HomeViewModel() : ViewModel() {

    var getDB = MutableLiveData<MutableList<Model>>()

    fun getData(){


    }
}