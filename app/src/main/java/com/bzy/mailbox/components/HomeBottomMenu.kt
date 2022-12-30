package com.bzy.mailbox.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.bzy.mailbox.helper.HomeBottomData

@Composable
fun HomeBottomMenu() {
    val items = listOf(
        HomeBottomData.Mail,
        HomeBottomData.Meet
    )

    BottomNavigation(
        backgroundColor = Color.White, contentColor = Color.Black
    ) {
        items.forEach {
            BottomNavigationItem(
                label = {
                        Text(text = it.title!!)
                },
                selected = true,
                alwaysShowLabel = true,
                onClick = { /*TODO*/ },
                icon = {
                    Icon(
                        imageVector = it.icon!!,
                        contentDescription = it.title,
                    )
                }
            )
        }
    }
}