package com.example.a30daysapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.a30daysapp.R

val CaveAtBrush = FontFamily(
    Font(R.font.caveatbrush_regular)
)


// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = CaveAtBrush,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp
    ),

    displayMedium = TextStyle(
        fontFamily = CaveAtBrush,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = CaveAtBrush,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp
    )
)
