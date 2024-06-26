package com.example.crud_firebase.nav

import androidx.compose.runtime.Composable
import com.example.crud_firebase.SharedViewModel
import com.example.crud_firebase.screen.MainScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.crud_firebase.screen.AddDataScreen
import com.example.crud_firebase.screen.GetDataScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    NavHost(
        navController = navController,
        startDestination = Screens.MainScreen.route
    ) {
        composable(route = Screens.MainScreen.route) {
            MainScreen(
                navController = navController,
            )
        }
        composable(route = Screens.GetDataScreen.route) {
            GetDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
        composable(route = Screens.AddDataScreen.route) {
            AddDataScreen(
                navController = navController,
                sharedViewModel = sharedViewModel
            )
        }
    }
}