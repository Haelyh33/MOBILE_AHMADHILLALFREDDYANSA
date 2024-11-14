package com.example.portfolioapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.portfolioapp.ui.screens.DetailScreen
import com.example.portfolioapp.ui.screens.Screen1
import com.example.portfolioapp.ui.screens.Screen2
import com.example.portfolioapp.ui.screens.Screen3

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "screen1") {
                composable("screen1") { Screen1(navController) }
                composable("screen2") { Screen2(navController) }
                composable("screen3") { Screen3() }
                composable("detail/{itemId}") { backStackEntry ->
                    val itemId = backStackEntry.arguments?.getString("itemId") ?: ""
                    DetailScreen(itemId, navController)
                }
            }
            }
        }
}
