package com.qpeterp.fitbattledesignsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

@Composable
fun FitBattleTheme(
    color: FitBattleColor = FitBattleTheme.color,
    typography: FitBattleTypography = FitBattleTheme.typography,
    shape: FitBattleShape = FitBattleTheme.shape,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColor provides color,
        LocalTypography provides typography,
        LocalShape provides shape
    ) {
        content()
    }
}

object FitBattleTheme {
    val color: FitBattleColor
        @Composable
        @ReadOnlyComposable
        get() = LocalColor.current

    val typography: FitBattleTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shape: FitBattleShape
        @Composable
        @ReadOnlyComposable
        get() = LocalShape.current
}