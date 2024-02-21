package com.example.fifa.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fifa.R


val Unbounded= FontFamily(
    Font(R.font.unbounded_variablefont_wght,FontWeight.Normal),
    Font(R.font.unbounded_variablefont_wght,FontWeight.Bold)
)

val Cabin = FontFamily(
    Font(R.font.cabin_bold, FontWeight.Bold)
)



// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Unbounded,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 35.sp,
        lineHeight = 25.sp,
        letterSpacing = 0.5.sp

    ),
    displayLarge = TextStyle(
        fontFamily = Cabin,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp

    ),





    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)