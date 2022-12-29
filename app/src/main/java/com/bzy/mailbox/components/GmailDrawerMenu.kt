package com.bzy.mailbox.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bzy.mailbox.helper.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {

    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Promotions,
        DrawerMenuData.Social,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Stared,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Send,
        DrawerMenuData.Scheduled,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.Spam,
        DrawerMenuData.Trash,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calender,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Settings,
        DrawerMenuData.Help

    )

    Column(Modifier.verticalScroll(scrollState)) {
        Text(
            text = "Gmail", color = Color.Red,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            fontSize = 25.sp,
        )

        menuList.forEach { item ->
            when {
                item.isDivider == true -> {
                    Divider(modifier = Modifier.padding(bottom = 10.dp, top = 10.dp))
                }
                item.isHeader == true -> {
                    Text(
                        text = item.title!!,
                        fontWeight = FontWeight.Light,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 20.dp, bottom = 20.dp, top = 20.dp)
                    )
                }

                else -> {
                    MailDrawerItem(item = item)
                }
            }

        }

    }
}


@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(16.dp)
    ) {
        Image(imageVector = item.icon!!, contentDescription = item.title!!, Modifier.weight(0.5f))
        Text(text = item.title, modifier = Modifier.weight(2.0f))
    }
}