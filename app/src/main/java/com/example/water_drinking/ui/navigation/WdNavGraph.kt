package com.example.water_drinking.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.water_drinking.ui.screens.HomeScreen
import com.example.water_drinking.ui.screens.LoadingScreen
import com.example.water_drinking.ui.screens.MoreInfoScreen
import com.example.water_drinking.ui.screens.WaterScreen

@Composable
fun WdNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "loading",
)
{
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    )
    {
        composable("loading"){
            LoadingScreen(navController = navController)
        }
        composable("home"){
            HomeScreen(navController = navController)
        }
        composable("water"){

            WaterScreen(navController = navController)
        }
        composable("details"){
            MoreInfoScreen(navController = navController)
        }
    }
}