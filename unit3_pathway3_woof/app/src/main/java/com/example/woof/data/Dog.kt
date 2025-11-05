package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

data class Dog(
    @StringRes val name: Int,
    val age: Int,
    @DrawableRes val imageResourceId: Int
)

val dogs = listOf(
    Dog(R.string.dog_name_1, 2, R.drawable.koda),
    Dog(R.string.dog_name_2, 16, R.drawable.lola),
    Dog(R.string.dog_name_3, 2, R.drawable.frankie),
    Dog(R.string.dog_name_4, 8, R.drawable.nox),
    Dog(R.string.dog_name_5, 8, R.drawable.faye),
    Dog(R.string.dog_name_6, 14, R.drawable.bella),
    Dog(R.string.dog_name_7, 2, R.drawable.moana),
    Dog(R.string.dog_name_8, 7, R.drawable.tzeitel),
    Dog(R.string.dog_name_9, 4, R.drawable.leroy)
)
