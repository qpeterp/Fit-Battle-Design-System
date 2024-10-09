package com.qpeterp.fitbattledesignsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse


/*
* 운동 한판 컬러를 정의한다는 뜻
* */
object FitBattleColor {
    val White = Color(0xFFFFFFFF)
    val Black = Color(0xFF000000)
    val Background = Color(0xFFFAFAFA)

    val Check = Color(0xFF48A068)
    val Error = Color(0xFFDE5257)

    val MainColor = Color(0xFFF06543)

    val MainColor50 = Color(0xFFFFE3DC)
    val MainColor100 = Color(0xFFFFC6B8)
    val MainColor200 = Color(0xFFFFA794)
    val MainColor300 = Color(0xFFFF896F)
    val MainColor400 = Color(0xFFFF6C4A)
    val MainColor500 = Color(0xFFF06543)
    val MainColor600 = Color(0xFFD95A3B)
    val MainColor700 = Color(0xFFBF4F33)
    val MainColor800 = Color(0xFFA5452B)
    val MainColor900 = Color(0xFF8B3A23)

    val Gray50 = Color(0xFFEEEEF1)
    val Gray100 = Color(0xFFD2D2DB)
    val Gray200 = Color(0xFFB5B5C4)
    val Gray300 = Color(0xFF9999AD)
    val Gray400 = Color(0xFF7D7D97)
    val Gray500 = Color(0xFF64647D)
    val Gray600 = Color(0xFF4D4D60)
    val Gray700 = Color(0xFF363644)
    val Gray800 = Color(0xFF202028)
    val Gray900 = Color(0xFF09090B)
}

@Composable
fun contentColorFor(backgroundColor: Color) =
    FitBattleColor.contentColorFor(backgroundColor).takeOrElse { LocalContentColor.current }

private fun FitBattleColor.contentColorFor(backgroundColor: Color): Color {
    return when (backgroundColor) {
        MainColor -> White
        Error -> White
        Gray100 -> White
        Background -> Black
        White -> Black
        else -> White
    }
}

internal val LocalColor = staticCompositionLocalOf { FitBattleColor }
internal val LocalContentColor = compositionLocalOf { Color.Black }
internal val LocalContentAlpha = compositionLocalOf { 1f }