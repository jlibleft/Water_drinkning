package com.example.water_drinking.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.water_drinking.icons.CupSoda
import com.example.water_drinking.icons.Glass_cup
import com.example.water_drinking.icons.Info
import com.example.water_drinking.ui.theme.Water_drinkingTheme
import org.jetbrains.annotations.ApiStatus.Experimental





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WaterScreen(
    navController: NavHostController
) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Water drinking", modifier =  Modifier.offset(x = 120.dp,y = 10.dp), color = MaterialTheme.colorScheme.secondary) })
    }) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.secondary),
                modifier = Modifier
                    .padding(16.dp)
                    .height(350.dp)
                    .fillMaxWidth(),
            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {

                    Box(modifier = Modifier
                        .height(290.dp)) {
                        Icon(
                            imageVector = Glass_cup,
                            contentDescription = null,
                            modifier = Modifier.size(280.dp)
                        )
                        //tutaj wstawić wyświetlanie ile kubków wody już było
                    }
                    Spacer(modifier = Modifier.height(8.dp))

                    Box() {
                        Text("Click to add another cup",
                            //modifier =  Modifier.offset(x = 100.dp,y = 300.dp)
                            textAlign = TextAlign.Center
                        )
                    }
                }


            }
            Row() {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.secondary),
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .width(160.dp)
                        .clickable { navController.navigate("home") }
                ) {
                    Box(modifier = Modifier
                        .fillMaxWidth()

                    ) {
                        Text("Go back\nto home", modifier =  Modifier
                            .offset(x = 50.dp,y = 50.dp)
                            
                        )
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.secondary),
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .fillMaxWidth(),
                ) {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .clickable(onClick = { navController.navigate("details") })
                        ) {
                            Row(modifier = Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Info,
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    "More info", modifier = Modifier

                                )
                            }
                        }

                }

            }
            Spacer(modifier = Modifier.height(8.dp))
            Box(
                modifier  = Modifier.fillMaxWidth()
                    .height(56.dp),
                contentAlignment = Alignment.Center
            ){
                Text("Remember to drink at\nleast 8 cups of water a day",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.secondary)
            }


        }

    }
}


@Preview(showBackground = true)
@Composable
fun WaterScreenPreview() {
    val mockNavController = rememberNavController()
    Water_drinkingTheme {
        WaterScreen(navController = mockNavController)
    }
}
