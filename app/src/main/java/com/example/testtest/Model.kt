package com.example.testtest

import java.io.Serializable

data class Model (
    var image: String,
    var cost : Int,
    var valueName: String,
    var info : String
    ): Serializable