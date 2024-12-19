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
import androidx.compose.material3.Button

import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.water_drinking.icons.Glass_cup
import com.example.water_drinking.icons.Info
import com.example.water_drinking.ui.theme.Water_drinkingTheme


val count = mutableListOf(0)
val onClick = {count[0] += 1}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WaterScreen(
    navController: NavHostController,

) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Water drinking", modifier =  Modifier.offset(x = 120.dp,y = 10.dp), color = MaterialTheme.colorScheme.secondary) })
    }) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)) {
            ElevatedCard(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.secondary),
                modifier = Modifier
                    .padding(16.dp)
                    .height(350.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp),

            ) {
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {

                    Box(modifier = Modifier
                        .height(290.dp)) {
                        Icon(
                            imageVector = Glass_cup,
                            contentDescription = null,
                            modifier = Modifier.size(280.dp)
                        )


                        Text("${count[0]}", modifier  = Modifier.align(Alignment.Center),
                            fontSize = 36.sp)

                        //kubki wody
//                        val icon: ImageView = findViewById(R.id.icon)
//                        val textView: TextView = findViewById(R.id.textView)
//
//
//                        val Count = getString(R.string.cup_count)

                    }
                    Spacer(modifier = Modifier.height(8.dp))

                    Button(onClick = onClick) {
                        Text("Click to add another cup",
                            //modifier =  Modifier.offset(x = 100.dp,y = 300.dp)
                            textAlign = TextAlign.Center
                        )
                    }
                }


            }
            Row() {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.secondary),
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .width(160.dp)
                        .clickable { navController.navigate("home") },
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp),
                ) {
                    Box(modifier = Modifier
                        .fillMaxWidth()

                    ) {
                        Text("Go back\nto home", modifier =  Modifier
                            .offset(x = 50.dp,y = 50.dp)
                            
                        )
                    }
                }
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.secondary),
                    modifier = Modifier
                        .padding(16.dp)
                        .height(150.dp)
                        .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 6.dp),
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


//@Preview(showBackground = true)
//@Composable
//fun WaterScreenPreview() {
//    val mockNavController = rememberNavController()
//    Water_drinkingTheme {
//        WaterScreen(navController = mockNavController, count = 0, onClick = count += 1})
//    }
//}
