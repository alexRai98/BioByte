package com.cajasullana.biobyte

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cajasullana.biobyte.application.modal.Routes
import com.cajasullana.biobyte.splashScreen.SplashScreen

@Composable
fun AppNavHost(navigationController: NavHostController){
    NavHost(
        navController = navigationController,
        startDestination = Routes.SplashScreen.route,
    ) {
        composable(Routes.SplashScreen.route) { SplashScreen(navigationController) }
    }
}
