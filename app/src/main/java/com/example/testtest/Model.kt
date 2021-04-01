package com.example.testtest

import android.media.Image
import android.widget.ImageView
import java.io.Serializable

data class Model (
    var image: Int,
    var cost : Int,
    var valueName: String,
    var info : String,
    var city : String
    ): Serializable