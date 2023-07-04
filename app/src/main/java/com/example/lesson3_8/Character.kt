package com.example.lesson3_8

import android.os.Parcelable
import java.io.Serializable

data class Character(var image:String? = null, var name: String? = "Имя неизвестно", var isAlive: String? = "Dead" ): Serializable
