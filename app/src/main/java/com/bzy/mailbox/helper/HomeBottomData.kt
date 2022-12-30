package com.bzy.mailbox.helper

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class HomeBottomData(
    val icon:ImageVector? = null,
    val title:String? = null
){
    object Mail:HomeBottomData(icon = Icons.Outlined.Mail, title = "Mail")
    object Meet:HomeBottomData(icon = Icons.Outlined.VideoCall, title = "Meet")

}