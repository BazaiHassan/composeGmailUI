package com.bzy.mailbox.helper

import androidx.compose.ui.graphics.Color

data class MailData(
     val mailId:Int,
     val userName:String,
     val subject:String,
     val body:String,
     val timeStamp:String,
     val color: Color
)
