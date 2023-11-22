package com.biobyte.android.sucess

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.biobyte.android.R
import com.biobyte.android.shared.ui.ButtonDefault
import com.biobyte.android.ui.theme.GreenLowPrincipalColor
import com.biobyte.android.ui.theme.NunitoTypography

@Preview
@Composable
fun SuccessScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation_success))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        LottieAnimation(
            composition = composition,
            iterations = 5,
            modifier = Modifier
                .size(300.dp)
                .padding(bottom = 30.dp)
        )
        Text(
            text = "Registro Exitoso",
            style = NunitoTypography.titleLarge
        )
        Text(
            text = "Juan Perez",
            modifier = Modifier.padding(bottom = 30.dp),
            style = NunitoTypography.headlineLarge
        )
        ButtonDefault(text = "Regresar", color = GreenLowPrincipalColor, enabled = true) {
        }
    }
}