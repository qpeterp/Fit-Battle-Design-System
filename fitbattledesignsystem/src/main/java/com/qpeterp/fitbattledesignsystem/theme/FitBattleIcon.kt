package com.qpeterp.fitbattledesignsystem.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.qpeterp.fitbattledesignsystem.R
import com.qpeterp.fitbattledesignsystem.foundation.Icon

@Composable
fun IcUser(
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified,
) {
    Icon(
        painter = painterResource(id = R.drawable.ic_user),
        contentDescription = contentDescription,
        modifier = modifier,
        tint = tint
    )
}
