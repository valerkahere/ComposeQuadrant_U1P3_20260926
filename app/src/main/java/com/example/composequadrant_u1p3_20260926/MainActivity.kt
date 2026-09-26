package com.example.composequadrant_u1p3_20260926

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composequadrant_u1p3_20260926.ui.theme.ComposeQuadrant_U1P3_20260926Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrant_U1P3_20260926Theme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
            }
        }
    }
}

@Composable
fun Page(name: String, modifier: Modifier = Modifier) {
    Column(                     modifier = Modifier.fillMaxSize(),
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Box() {
                Text(
                    text = "Text composable\n",
                )
                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.\n",

                )
            }
            Box() {
                Text(
                    text = "Image composable\n",
                )
                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                )
            }
        }
        Row() {
            Box() {
                Text(
                    text = "Row composable\n",
                )
                Text(
                    text = "A layout composable that places its children in a horizontal sequence.\n",
                )
            }
            Box() {
                Text(
                    text = "Column composable\n",
                )
                Text(
                    text = "A layout composable that places its children in a vertical sequence.\n",
                )
            }
        }
    }
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ComposeQuadrant_U1P3_20260926Theme {
        Page("me")
    }
}