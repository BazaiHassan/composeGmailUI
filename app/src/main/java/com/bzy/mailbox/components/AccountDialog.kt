package com.bzy.mailbox.components

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.ManageAccounts
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.bzy.mailbox.R

@Composable
fun AccountDialog(openDialog: MutableState<Boolean>) {
    Dialog(onDismissRequest = { openDialog.value = false }) {
        AccountDialogUI()
    }
}


@Composable
fun AccountDialogUI(modifier: Modifier = Modifier) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row() {
                Icon(imageVector = Icons.Default.Close, contentDescription = "close dialog")
                Spacer(Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.googlelogo),
                    contentDescription = "Google Logo"
                )
                Spacer(Modifier.weight(1f))
            }

            Row() {
                Image(
                    painter = painterResource(id = R.drawable.image_hb),
                    contentDescription = "user image",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Black)
                )

                Column(
                    Modifier
                        .weight(2.0f)
                        .padding(start = 16.dp)
                ) {
                    Text(
                        text = "H BZ",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.DarkGray
                    )

                    Text(
                        text = "bazaee.hassan@gmail.com",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Light,
                        color = Color.Gray
                    )

                }
                Spacer(Modifier.weight(1f))
                Text(
                    text = "18",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(50.dp),
                    border = BorderStroke(1.dp, color = Color.LightGray)
                ) {
                    Text(text = "Manage Your Google Account", Modifier.padding(8.dp), textAlign = TextAlign.Center)
                }
            }
            Divider()
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Outlined.Cloud, contentDescription = "Cloud", modifier = Modifier.padding(10.dp))
                Text(text = "Storage Used: 78% of 15 GB", color = Color.Gray, fontSize = 16.sp)
                Spacer(Modifier.weight(0.5f))

            }
            Divider()
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Outlined.VerifiedUser, contentDescription = "Cloud", modifier = Modifier.padding(10.dp))
                Text(text = "Add another account", color = Color.Gray, fontSize = 16.sp)
                Spacer(Modifier.weight(0.5f))

            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Outlined.ManageAccounts, contentDescription = "Cloud", modifier = Modifier.padding(10.dp))
                Text(text = "Manage accounts on this device", color = Color.Gray, fontSize = 16.sp)
                Spacer(Modifier.weight(0.5f))

            }
            Divider()
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly) {
                Text(text = "Privacy Policy", color = Color.Gray, fontSize = 16.sp)
                Spacer(Modifier.weight(0.5f))
                Text(text = "Terms of Services", color = Color.Gray, fontSize = 16.sp)

            }

        }
    }
}