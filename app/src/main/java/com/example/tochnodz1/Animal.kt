package com.example.tochnodz1

import android.os.Parcelable

import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(
    val name: String,
    val disc: String,


    ): Parcelable

