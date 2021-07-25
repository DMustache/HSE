package com.example.review.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

sealed interface Item : Parcelable {
    @Parcelize
    data class Header(val title: String) : Item
    @Parcelize
    data class WithText(val text: String) : Item
}