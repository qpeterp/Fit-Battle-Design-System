package com.qpeterp.fitbattledesignsystem.component.bacsic.avatar

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.qpeterp.fitbattledesignsystem.R
import com.qpeterp.fitbattledesignsystem.component.bacsic.surface
import com.qpeterp.fitbattledesignsystem.foundation.Text
import com.qpeterp.fitbattledesignsystem.modifier.fitBattleClickable
import com.qpeterp.fitbattledesignsystem.theme.FitBattleColor
import com.qpeterp.fitbattledesignsystem.theme.FitBattleTheme
import com.qpeterp.fitbattledesignsystem.theme.IcUser
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.components.rememberImageComponent
import com.skydoves.landscapist.glide.GlideImage
import com.skydoves.landscapist.placeholder.shimmer.Shimmer
import com.skydoves.landscapist.placeholder.shimmer.ShimmerPlugin

/**
 * FitBattle Avatar, can express saved image
 *
 * @param painter profile image
 * @param modifier modifier
 * @param shape shape of avatar, basic is circle
 * @param size avatar circle size, basic is 40.dp
 * @param rippleColor rippleColor
 * @param rippleEnable rippleEnable
 * @param bounded bounded
 * @param onClick when click avatar
 */
@Composable
fun Avatar(
    painter: Painter,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
    rippleColor: Color = Color.Unspecified,
    rippleEnable: Boolean = true,
    bounded: Boolean = true,
    onClick: (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .size(size)
    ) {
        Image(
            modifier = Modifier
                .clip(shape)
                .fillMaxSize()
                .fitBattleClickable(
                    onClick = onClick,
                    rippleColor = rippleColor,
                    rippleEnable = rippleEnable,
                    bounded = bounded
                ),
            painter = painter,
            contentDescription = null
        )
    }
}

/**
 * FitBalttle Avatar, can express first word of name
 *
 * @param name show first word
 * @param modifier modifier
 * @param nameStyle text Style
 * @param nameColor text Color
 * @param backgroundColor color for circle background
 * @param shape shape of avatar, basic is circle
 * @param size avatar circle size, basic is 40.dp
 * @param rippleColor rippleColor
 * @param rippleEnable rippleEnable
 * @param bounded bounded
 * @param onClick when click avatar
 */
@Composable
fun Avatar(
    name: String,
    modifier: Modifier = Modifier,
    nameStyle: TextStyle = FitBattleTheme.typography.title2,
    nameColor: Color = FitBattleTheme.color.Gray400,
    backgroundColor: Color = FitBattleTheme.color.Background,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
    rippleColor: Color = Color.Unspecified,
    rippleEnable: Boolean = true,
    bounded: Boolean = true,
    onClick: (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .size(size)
            .surface(shape, backgroundColor)
            .fitBattleClickable(
                onClick = onClick,
                rippleColor = rippleColor,
                rippleEnable = rippleEnable,
                bounded = bounded
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = name.take(1),
            style = nameStyle,
            color = nameColor,
        )
    }
}

/**
 * FitBattle Avatar, can express icon center
 *
 * @param modifier modifier
 * @param iconSize icon's size
 * @param iconColor icon's color
 * @param backgroundColor color for circle background
 * @param shape shape of avatar, basic is circle
 * @param size avatar circle size, basic is 40.dp
 * @param rippleColor rippleColor
 * @param rippleEnable rippleEnable
 * @param bounded bounded
 * @param onClick when click avatar
 */
@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    iconSize: Dp = 20.dp,
    iconColor: Color = FitBattleTheme.color.Gray400,
    backgroundColor: Color = FitBattleTheme.color.Background,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
    rippleColor: Color = Color.Unspecified,
    rippleEnable: Boolean = true,
    bounded: Boolean = true,
    onClick: (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .size(size)
            .surface(shape, backgroundColor)
            .fitBattleClickable(
                onClick = onClick,
                rippleColor = rippleColor,
                rippleEnable = rippleEnable,
                bounded = bounded
            ),
        contentAlignment = Alignment.Center
    ) {
        IcUser(
            modifier = Modifier
                .align(Alignment.Center)
                .size(iconSize),
            tint = iconColor,
            contentDescription = null,
        )
    }
}

/**
 * FitBattle Avatar, can express remote image
 *
 * @param link remote image link
 * @param modifier modifier
 * @param backgroundColor color for circle background
 * @param shape shape of avatar, basic is circle
 * @param size avatar circle size, basic is 40.dp
 * @param placeHolderBaseColor loading place circle base color
 * @param placeHolderHighlightColor loading place highlight bar color
 * @param failureIconSize icon size when fail to load image
 * @param failureIconColor icon color when fail to load image
 * @param rippleColor rippleColor
 * @param rippleEnable rippleEnable
 * @param bounded bounded
 * @param onClick when click avatar
 */
@Composable
fun Avatar(
    link: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color = FitBattleTheme.color.Background,
    shape: Shape = CircleShape,
    size: Dp = 40.dp,
    placeHolderBaseColor: Color = FitBattleTheme.color.White,
    placeHolderHighlightColor: Color = FitBattleTheme.color.MainColor100,
    failureIconSize: Dp = 20.dp,
    failureIconColor: Color = FitBattleTheme.color.Gray400,
    rippleColor: Color = Color.Unspecified,
    rippleEnable: Boolean = true,
    bounded: Boolean = true,
    onClick: (() -> Unit)? = null,
) {
    Box(
        modifier = modifier
            .size(size)
            .surface(shape, backgroundColor)
            .fitBattleClickable(
                onClick = onClick,
                rippleColor = rippleColor,
                rippleEnable = rippleEnable,
                bounded = bounded
            ),
        contentAlignment = Alignment.Center,
    ) {
        GlideImage(
            modifier = Modifier
                .fillMaxSize(),
            imageModel = { link },
            imageOptions = ImageOptions(
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center,
            ),
            component = rememberImageComponent {
                +ShimmerPlugin(
                    Shimmer.Flash(
                        baseColor = placeHolderBaseColor,
                        highlightColor = placeHolderHighlightColor
                    )
                )
            },
            failure = {
                IcUser(
                    modifier = Modifier
                        .size(failureIconSize)
                        .align(Alignment.Center),
                    tint = failureIconColor,
                    contentDescription = null,
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AvatarPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Avatar(name = "이성은")
        Spacer(modifier = Modifier.height(10.dp))
        Avatar(painter = painterResource(id = R.drawable.img_dummy))
        Spacer(modifier = Modifier.height(10.dp))
        Avatar(iconColor = FitBattleColor.Gray400)
        Avatar(iconColor = FitBattleColor.Gray400, size = 100.dp, iconSize = 50.dp)
        Spacer(modifier = Modifier.height(10.dp))
        Avatar(link = "https://i.ytimg.com/vi/zbyet4HK4ko/maxresdefault.jpg", size = 100.dp)
        Spacer(modifier = Modifier.height(10.dp))
        Avatar(
            modifier = Modifier.padding(start = 10.dp),
            link = "https://i.ytimg.com/vi/zbyet4HK4ko/maxresdefault.jp",
            size = 26.dp,
            failureIconSize = 13.dp,
            failureIconColor = FitBattleTheme.color.Gray400,
            backgroundColor = FitBattleColor.White
        )
    }
}