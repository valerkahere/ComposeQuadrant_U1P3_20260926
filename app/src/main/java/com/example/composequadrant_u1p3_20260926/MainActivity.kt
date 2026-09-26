package com.example.composequadrant_u1p3_20260926

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant_u1p3_20260926.ui.theme.ComposeQuadrant_U1P3_20260926Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrant_U1P3_20260926Theme {
                Page()
            }
        }
    }
}

@Composable
fun Page(modifier: Modifier = Modifier) {
    // Outer Column stacks the two rows vertically
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Top half (Row with weight 1f)
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.", backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)


            )
            QuadrantCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.", backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)

            )
        }

        // Bottom half (Row with weight 1f)
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.", backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)


            )
            QuadrantCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.", backgroundColor = Color(0xFFF6EDFF)
                ,
                modifier = Modifier.weight(1f)

            )
        }
    }
}



// Reusable card: A Column that groups 2 Text composables together

@Composable
fun QuadrantCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ComposeQuadrant_U1P3_20260926Theme {
        Page()
    }
}