package com.qpeterp.fitbattledesignsystem.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.qpeterp.fitbattledesignsystem.R
import com.qpeterp.fitbattledesignsystem.foundation.Text
import com.qpeterp.fitbattledesignsystem.modifier.fitBattleClickable

val notoSansKR = FontFamily(
    Font(R.font.noto_sans_kr_light, FontWeight.Light),
    Font(R.font.noto_sans_kr_regular, FontWeight.Normal),
    Font(R.font.noto_sans_kr_medium, FontWeight.Medium),
    Font(R.font.noto_sans_kr_bold, FontWeight.Bold),
    Font(R.font.noto_sans_kr_semi_bold, FontWeight.SemiBold),
)

object FitBattleTypography {
    @Stable
    val display1 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 57.sp,
        lineHeight = 64.sp,
    )

    @Stable
    val display2 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 45.sp,
        lineHeight = 52.sp
    )

    @Stable
    val display3 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        lineHeight = 44.sp
    )

    @Stable
    val headline1 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp,
        lineHeight = 40.sp
    )

    @Stable
    val headline2 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 36.sp
    )

    @Stable
    val headline3 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 32.sp
    )

    @Stable
    val title1 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 26.sp
    )

    @Stable
    val title2 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 22.sp
    )

    @Stable
    val title3 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 20.sp
    )

    @Stable
    val label1 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 10.sp
    )

    @Stable
    val label2 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp
    )

    @Stable
    val label3 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 14.sp
    )

    @Stable
    val body1 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp
    )

    @Stable
    val body2 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    )

    @Stable
    val body3 = TextStyle(
        fontFamily = notoSansKR,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp
    )
}

@Composable
fun Display1(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.display1,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Display2(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.display2,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Display3(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.display3,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Headline1(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.headline1,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Headline2(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.headline2,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Headline3(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.headline3,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Title1(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.title1,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Title2(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.title2,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Title3(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.title3,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Label1(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.label1,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Label2(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.label2,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Label3(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.label3,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Body1(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.body1,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Body2(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.body2,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun Body3(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = LocalContentColor.current,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.body3,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

@Composable
fun FitBattleError(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color = FitBattleColor.Error,
    textAlign: TextAlign = TextAlign.Start,
    textDecoration: TextDecoration? = null,
    textOverflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    onClick: (() -> Unit)? = null,
    rippleEnabled: Boolean = true,
    rippleColor: Color = Color.Unspecified,
    bounded: Boolean = true,
) {
    Text(
        modifier = modifier.fitBattleClickable(
            onClick = onClick,
            rippleColor = rippleColor,
            rippleEnable = rippleEnabled,
            bounded = bounded
        ),
        text = text,
        style = FitBattleTypography.body3,
        color = textColor,
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = textOverflow,
        softWrap = softWrap,
        maxLines = maxLines,
        onTextLayout = onTextLayout,
    )
}

internal val LocalTypography = staticCompositionLocalOf { FitBattleTypography }

@Preview
@Composable
private fun PreviewTypo() {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Display1(text = "Display1")
        Display2(text = "Display2")
        Display3(text = "Display3")

        Headline1(text = "Headline1")
        Headline2(text = "Headline2")
        Headline3(text = "Headline3")

        Title1(text = "Title1")
        Title2(text = "Title2")
        Title3(text = "Title3")

        Label1(text = "Label1")
        Label2(text = "Label2")
        Label3(text = "Label3")

        Body1(text = "Body1")
        Body2(text = "Body2")
        Body3(text = "Body3")
    }
}