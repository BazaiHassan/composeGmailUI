package com.bzy.mailbox.helper

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData (
    val icon:ImageVector? = null,
    val title:String? = null,
    val isDivider:Boolean? = null,
    val isHeader:Boolean? = null,

){
    object AllInboxes:DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All Inboxes"
    )

    object Primary:DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )

    object Promotions:DrawerMenuData(
        icon = Icons.Outlined.Discount,
        title = "Promotions"
    )

    object Social:DrawerMenuData(
        icon = Icons.Outlined.People,
        title = "Social"
    )

    object Stared:DrawerMenuData(
        icon = Icons.Outlined.Star,
        title = "Stared"
    )

    object Snoozed:DrawerMenuData(
        icon = Icons.Outlined.LockClock,
        title = "Snoozed"
    )

    object Important:DrawerMenuData(
        icon = Icons.Outlined.LabelImportant,
        title = "Important"
    )

    object Send:DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Send"
    )

    object Scheduled:DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )

    object Outbox:DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )

    object Draft:DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Draft"
    )

    object Spam:DrawerMenuData(
        icon = Icons.Outlined.Dangerous,
        title = "Spam"
    )

    object Trash:DrawerMenuData(
        icon = Icons.Outlined.Delete,
        title = "Trash"
    )

    object Calender:DrawerMenuData(
        icon = Icons.Outlined.CalendarMonth,
        title = "Calender"
    )

    object Contacts:DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )

    object Settings:DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )

    object Help:DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & Feedback"
    )

    object Divider:DrawerMenuData(
        isDivider = true
    )

    object HeaderOne:DrawerMenuData(
        isHeader = true,
        title = "All Labels"
    )

    object HeaderTwo:DrawerMenuData(
        isHeader = true,
        title = "Google Apps"
    )


}