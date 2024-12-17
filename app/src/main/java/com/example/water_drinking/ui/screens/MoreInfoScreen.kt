package com.example.water_drinking.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

import androidx.navigation.compose.rememberNavController

import com.example.water_drinking.R
import com.example.water_drinking.ui.theme.Water_drinkingTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


//var nums = (0..9).random()
var randnum = (0..9).random()

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreInfoScreen(
    navController: NavHostController
) {
    Scaffold(topBar = {
        TopAppBar(title = { Text("Did you know?", modifier =  Modifier.offset(x = 120.dp,y = 10.dp)) })
    }) { innerPadding ->
        Column(modifier = Modifier
            .padding(innerPadding)) {
            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp)
                    .padding(bottom = 8.dp)
                    .height(280.dp)
                    .fillMaxWidth(),
            ) {
                Box(modifier = Modifier
                    .fillMaxSize(),
                ) {
                    Column(
                        modifier = Modifier.padding(10.dp)
                    ){
                        Text("Why drinking enough is important:",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            modifier = Modifier.padding(8.dp))
                        Text("Fact of the day:\n${Messages[randnum]}",
                            fontSize = 16.sp,
                            textAlign = TextAlign.Justify)
                    }
                    Text("From: www.medicalnewstoday.com/articles/290814#15-benefits",
                        fontSize = 8.sp,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(4.dp)
                    )
                }
            }
            Card(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
                    .height(48.dp)
                    .fillMaxWidth()

            ){
                Box(modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .clickable { navController.navigate("water") }

                ){
                    Text("GO BACK",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(4.dp)
                            .align(Alignment.Center))

                }
            }

            Card(modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()){
                Box(
                    modifier = Modifier.fillMaxSize()
                ){
                    val image = painterResource(R.drawable.vecteezy_glass_of_water_png_graphic_clipart_design_20001939)
                    Image(
                        painter = image,
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(24.dp)

                    )
                }
                //image goes here
            }
        }
    }
}

val Messages = listOf("Cartilage, found in joints and the disks of the spine, contains around 80 percent water. Long-term dehydration can reduce the joints’ shock-absorbing ability, leading to joint pain.",
    "Saliva helps us digest our food and keeps the mouth, nose, and eyes moist. This prevents friction and damage. Drinking water also keeps the mouth clean. Consumed instead of sweetened beverages, it can also reduce tooth decay.",
    "Blood is more than 90 percent water, and blood carries oxygen to different parts of the body.",
    "Water intake is associated with improved skin barrier. With dehydration, the skin can become more vulnerable to skin disorders.",
    "Dehydration can affect brain structure and function. It is also involved in the production of hormones and neurotransmitters. Prolonged dehydration can lead to problems with thinking and reasoning.",
    "Water that is stored in the middle layers of the skin comes to the skin’s surface as sweat when the body heats up. As it evaporates, it cools the body.",
    "Dehydration can cause blood to become thicker, which is associated with decreased blood pressure.",
    "When dehydrated, airways are restricted by the body in an effort to minimize water loss. This can worsen asthma and allergies.",
    "The kidneys regulate fluid in the body. Insufficient water can lead to kidney stones and other problems.",
    "Water may also help with weight loss if it is consumed instead of sweetened juices and sodas. “Preloading” with water before meals can help prevent overeating by creating a sense of fullness.")


@Composable
@Preview
fun MoreInfoScreenPreview(){
    val mockNavController = rememberNavController()
    Water_drinkingTheme {
        MoreInfoScreen(navController = mockNavController)
    }
}