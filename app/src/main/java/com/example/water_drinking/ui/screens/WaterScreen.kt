package com.example.water_drinking.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.water_drinking.ui.theme.Water_drinkingTheme
import org.jetbrains.annotations.ApiStatus.Experimental

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WaterScreen() {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Water drinking", modifier =  Modifier.offset(x = 120.dp,y = 10.dp)) })
    }) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)) {
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .height(450.dp)
                    .fillMaxWidth(),
            ) {
                Box(modifier = Modifier
                    .fillMaxWidth(),
                ) {
                    Text("Click to fill the cup", modifier =  Modifier.offset(x = 100.dp,y = 400.dp))
                }
            }
            Row(modifier = Modifier.padding(innerPadding)) {
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .width(160.dp),
                ) {
                    Box(modifier = Modifier
                        .fillMaxWidth(),
                    ) {
                        Text("Go back\nto home", modifier =  Modifier.offset(x = 50.dp,y = 50.dp))
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .fillMaxWidth(),
                ) {
                    Box(modifier = Modifier
                        .fillMaxWidth(),
                    ) {
                        Text("More info", modifier =  Modifier.offset(x = 50.dp,y = 60.dp))
                    }
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WaterScreenPreview() {
    Water_drinkingTheme {
        WaterScreen()
    }
}
