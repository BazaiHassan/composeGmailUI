package com.bzy.mailbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bzy.mailbox.components.HomeAppBar
import com.bzy.mailbox.ui.theme.MailBoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MailBoxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {
    Scaffold(topBar = { HomeAppBar() }) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MailBoxTheme {
        GmailApp()
    }
}