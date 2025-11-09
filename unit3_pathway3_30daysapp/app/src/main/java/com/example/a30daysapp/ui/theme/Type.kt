package com.example.a30daysapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.a30daysapp.R

val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

val Typography = Typography(
    bodyMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = Poppins
    ),
    titleLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = Poppins,
        fontWeight = FontWeight.Bold
    )
)
