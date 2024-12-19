package com.example.water_drinking.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.water_drinking.R
import com.example.water_drinking.ui.theme.Water_drinkingTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    navController: NavHostController
){
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {
            TopAppBar(title = { Text("Drink & Activity Tracker",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.secondary
            )
            })
        })
    { innerPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(innerPadding)){
            ElevatedCard(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp)
                    .height(120.dp)
                    .fillMaxWidth()
                    .clickable(onClick = { navController.navigate("water")}),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp),
            ){
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopCenter,
                    ){

                    Text("STAY HYDRATED!",
                        modifier =  Modifier
                            .padding(16.dp)
                            .align(Alignment.Center),
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                }

            }

            ElevatedCard(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.secondary
                ),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 16.dp)
                    .height(120.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp),
            ) {
                Box(modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopCenter){

                    Text("Second feature",
                        modifier =  Modifier
                            .padding(16.dp)
                            .align(Alignment.Center),
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                }
            }

            //Spacer(modifier = Modifier.height(16.dp))

            Row(modifier = Modifier.fillMaxWidth()
                .height(75.dp)) {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.secondary
                    ),
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
                        .height(56.dp)
                        .width(160.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp),

                    ) {
                    Box(modifier = Modifier
                        .fillMaxWidth(),
                    ) {
                        Text("More Apps",
                            modifier =  Modifier
                                .padding(16.dp)
                                .align(Alignment.Center)
                        )
                    }
                }


            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(250.dp)
            ){
                val image = painterResource(R.drawable.vecteezy_transparent_blue_water_bottle_with_black_cap_isolated_on_50591748)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomEnd)

                )
            }

            Text("App created by JEJ Studio",
                modifier = Modifier
                    .offset(x = 80.dp)
                    .padding(8.dp),
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.secondary
            )

            
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    val mockNavController = rememberNavController()
    Water_drinkingTheme {
        HomeScreen(navController = mockNavController)
    }
}