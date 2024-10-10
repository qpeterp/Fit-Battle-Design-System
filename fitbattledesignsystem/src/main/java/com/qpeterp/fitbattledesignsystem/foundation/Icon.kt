package com.qpeterp.fitbattledesignsystem.foundation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toolingGraphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import com.qpeterp.fitbattledesignsystem.theme.LocalContentAlpha
import com.qpeterp.fitbattledesignsystem.theme.LocalContentColor

/**
 * @param painter Draw Icon
 * @param contentDescription Icon description
 * @param modifier
 * @param tint define icon color. if null, non color (use 3D icon recommend put null)
 */
@Composable
fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color? = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
) {
    val colorFilter: ColorFilter? = when (tint) {
        null -> {
            null
        }
        Color.Unspecified -> {
            ColorFilter.tint(LocalContentColor.current)
        }
        else -> {
            ColorFilter.tint(tint)
        }
    }

    val semantics = if (contentDescription != null) {
        // 어떤 역할을 하는지 알려 주는 sementic
        Modifier.semantics {
            this.contentDescription = contentDescription
            this.role = Role.Image
        }
    } else {
        Modifier
    }

    Box(
        modifier
            .toolingGraphicsLayer() // 그리기 레이어를 추가
            .defaultSizeFor(painter)
            .paint(
                painter,
                colorFilter = colorFilter,
                contentScale = ContentScale.Fit
            )
            .then(semantics)
    )
}

// 기본 사이즈를 지정
private fun Modifier.defaultSizeFor(painter: Painter) =
    this.then(
        if (painter.intrinsicSize == Size.Unspecified || painter.intrinsicSize.isInfinite()) {
            Modifier.size(24.dp)
        } else {
            Modifier
        }
    )

private fun Size.isInfinite() = width.isInfinite() && height.isInfinite()