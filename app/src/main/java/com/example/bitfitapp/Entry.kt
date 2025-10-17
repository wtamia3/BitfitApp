package com.example.bitfitapp

// Entry.kt

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize   data class Entry(
    val foodName: String,
    val calories: Int,
    val date: String,
    val metric: String,
    val value: String
) : Parcelable
