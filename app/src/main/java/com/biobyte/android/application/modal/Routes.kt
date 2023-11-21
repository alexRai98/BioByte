package com.biobyte.android.application.modal
sealed class Routes(val route: String) {
    object SplashScreen : Routes("splashScreen")
    object LoginScreen : Routes("loginScreen")

}

