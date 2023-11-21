package com.biobyte.android

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.biobyte.android.application.modal.Routes
import com.biobyte.android.splashScreen.SplashScreen

@Composable
fun AppNavHost(navigationController: NavHostController){
    NavHost(
        navController = navigationController,
        startDestination = Routes.SplashScreen.route,
    ) {
        composable(Routes.SplashScreen.route) { SplashScreen(navigationController) }
    }
}
