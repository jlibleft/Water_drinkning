package com.example.water_drinking.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.water_drinking.ui.theme.Water_drinkingTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (){
    Scaffold(topBar = {
        TopAppBar(title = { Text("Drink & Activity Tracker",
           modifier =  Modifier,
            style = MaterialTheme.typography.headlineSmall,
            )
        })
    })
    { innerPadding ->
         Column(
             horizontalAlignment = Alignment.CenterHorizontally,
             modifier = Modifier.padding(innerPadding)){
             Card(
                 modifier = Modifier
                     .padding(16.dp)
                     .height(200.dp)
                     .fillMaxWidth(),
             ){
                 Box(modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.TopCenter){

                     Text("STAY HYDRATED!",
                     modifier =  Modifier
                         .padding(16.dp),
                     style = MaterialTheme.typography.headlineMedium)}

             }

             Card(
                 modifier = Modifier
                     .padding(16.dp)
                     .height(200.dp)
                     .fillMaxWidth(),
             ) {
                 Box(modifier = Modifier.fillMaxSize(),
                     contentAlignment = Alignment.TopCenter){

                     Text("Second feature",
                         modifier =  Modifier
                             .padding(16.dp),
                         style = MaterialTheme.typography.headlineMedium)}
             }

             Row(modifier = Modifier.padding(innerPadding)) {
                 Card(
                     modifier = Modifier
                         .padding(16.dp)
                         .height(56.dp)
                         .width(160.dp),

                 ) {
                     Box(modifier = Modifier
                         .fillMaxWidth(),
                     ) {
                         Text("More Apps", modifier =  Modifier.padding(16.dp))
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
                         Text("Tu wstawić\nladna ikonke", modifier =  Modifier.padding(16.dp))
                     }
                 }

             }
             Text("App created by JEJ Studio",
                 modifier = Modifier
                     .offset(x = 110.dp, y = 280.dp)
                     .padding(8.dp),
                 style = MaterialTheme.typography.labelSmall
             )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    Water_drinkingTheme {
        HomeScreen()
    }
}