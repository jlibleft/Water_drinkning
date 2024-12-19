package com.example.water_drinking.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember

@Composable
fun WaterDrinkingApp(startDestination: String?) {
    startDestination?.let{

        WdNavGraph(startDestination = startDestination)//Navigation Graph - definicja ekranów i przejść
    }
}