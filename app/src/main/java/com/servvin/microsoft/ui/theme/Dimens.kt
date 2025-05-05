package com.servvin.microsoft.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class Dimens(
    // 🟦 Borders
    val borderNormal: Dp = 4.dp,

    // 🟨 Botones
    val buttonHeightNormal: Dp = 56.dp,

    // 🟩 Icons
    val iconSizeSmall: Dp = 24.dp,
    val iconSizeNormal: Dp = 36.dp,

    // 🟥 Padding
    val paddingSmall: Dp = 4.dp,
    val paddingNormal: Dp = 8.dp,
    val paddingMedium: Dp = 16.dp,
    val paddingLarge: Dp = 24.dp,

    // 🟪 Spaciness
    val spacerSmall: Dp = 4.dp,
    val spacerNormal: Dp = 8.dp,
    val spacerRegular: Dp = 12.dp,
    val spacerMedium: Dp = 16.dp,
    val spacerLarge: Dp = 40.dp,
    val spacerHeightNormal: Dp = 60.dp,

    // 🟫 Borders redondeados
    val roundedShapeSmall: Dp = 4.dp,
    val roundedShapeNormal: Dp = 8.dp,
    val roundedShapeDoce: Dp = 12.dp,
    val roundedShapeMedium: Dp = 16.dp,
    val roundedShapeLarge: Dp = 40.dp,

    // 🔤 Tamaños de texto
    val textSizeTiny: TextUnit = 10.sp,
    val textSizeDoce: TextUnit = 12.sp,
    val textSizeXS: TextUnit = 13.sp,
    val textSizeSmall: TextUnit = 14.sp,
    val textSizeNormal: TextUnit = 16.sp,
    val textSizeMedium: TextUnit = 18.sp,
    val textSizeSemiLarge: TextUnit = 20.sp,
    val textSizeLarge: TextUnit = 22.sp,
    val textSizeExtraLarge: TextUnit = 28.sp,
)

val defaultDimens = Dimens()

val tabletDimens = Dimens(
    borderNormal = 12.dp,
    buttonHeightNormal = 64.dp,

    iconSizeSmall = 36.dp,
    iconSizeNormal = 48.dp,

    paddingSmall = 8.dp,
    paddingNormal = 16.dp,
    paddingMedium = 24.dp,
    paddingLarge = 30.dp,

    spacerSmall = 8.dp,
    spacerNormal = 16.dp,
    spacerRegular = 16.dp,
    spacerMedium = 24.dp,
    spacerLarge = 56.dp,
    spacerHeightNormal = 72.dp,

    roundedShapeSmall = 8.dp,
    roundedShapeNormal = 16.dp,
    roundedShapeDoce = 20.dp,
    roundedShapeMedium = 24.dp,
    roundedShapeLarge = 56.dp,

    textSizeTiny = 11.sp,
    textSizeDoce = 13.sp,
    textSizeXS = 14.sp,
    textSizeSmall = 16.sp,
    textSizeNormal = 18.sp,
    textSizeMedium = 20.sp,
    textSizeSemiLarge = 23.sp,
    textSizeLarge = 24.sp,
    textSizeExtraLarge = 32.sp,
)