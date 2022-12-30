package com.bzy.mailbox.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bzy.mailbox.helper.MailData
import com.bzy.mailbox.helper.mockData


@Composable
fun MailList(paddingValues: PaddingValues) {
    Box(modifier = Modifier.padding(paddingValues)){
        LazyColumn(
            Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            items(mockData){
                mailData ->
                MailItem(mailData = mailData)
            }
        }
    }
}

@Composable
fun MailItem(mailData: MailData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(1.dp, top = 8.dp)
    ) {
        Card(
            Modifier
                .padding(8.dp)
                .size(40.dp)
                .clip(CircleShape),
            backgroundColor = mailData.color,
        ) {
            Text(text = mailData.userName[0].toString(), textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp), color = Color.White)
        }
        
        Column(Modifier.weight(2.0f)) {
            Text(
                text =mailData.userName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(
                text =mailData.subject,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text =mailData.body,
                fontSize = 13.sp,
                fontWeight = FontWeight.Light,
                color = Color.Gray
            )
        }

        Column {
            Text(text = mailData.timeStamp)
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(50.dp)
                    .padding(top = 16.dp)
            ) {
                Icon(imageVector = Icons.Outlined.StarOutline, contentDescription ="" )
            }
        }
    }
}