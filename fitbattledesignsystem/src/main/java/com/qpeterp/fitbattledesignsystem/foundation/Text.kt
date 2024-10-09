package com.qpeterp.fitbattledesignsystem.foundation

import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import com.qpeterp.fitbattledesignsystem.theme.FitBattleTypography
import com.qpeterp.fitbattledesignsystem.theme.LocalContentAlpha

/**
 * FitBattle Basic Text
 *
 * @param text value
 * @param modifier
 * @param color text color
 * @param style text style
 * @param textAlign text alight
 * @param textDecoration decoration of text
 * @param overflow when text overflow
 * @param softWrap basic is true
 * @param maxLines Max line counts
 * @param onTextLayout textLayout
 */
@Composable
fun Text(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    style: TextStyle = FitBattleTypography.body1,
    textAlign: TextAlign = TextAlign.Center,
    textDecoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {}
) {

    val textColor = color.takeOrElse {
        style.color.takeOrElse {
            LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
        }
    }

    val mergedStyle = style.copy(
        color = textColor, textAlign = textAlign, textDecoration = textDecoration
    )

    BasicText(
        text = text,
        modifier = modifier,
        style = mergedStyle,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout
    )
}

@Composable
fun ProvideTextStyle(value: TextStyle, content: @Composable () -> Unit) {
    val mergedStyle = LocalTextStyle.current.merge(value)
    CompositionLocalProvider(LocalTextStyle provides mergedStyle, content = content)
}

val LocalTextStyle = compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }