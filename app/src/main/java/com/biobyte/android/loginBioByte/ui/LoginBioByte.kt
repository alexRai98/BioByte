package com.biobyte.android.loginBioByte.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biobyte.android.R
import com.biobyte.android.ui.theme.GreenPrincipalColor
import com.biobyte.android.shared.ui.ButtonDefault
import com.biobyte.android.shared.ui.Input

@Preview
@Composable
fun LoginBioByte() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White), verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 40.dp)
                .offset(y = -30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(id = R.drawable.new_login_logo_bio_byte),
                contentDescription = "", modifier = Modifier.size(180.dp)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Input(value = "", label = "Usuario") { }
            Spacer(modifier = Modifier.height(10.dp))
            Input(value = "", label = "Contrseña") { }
            Spacer(modifier = Modifier.height(25.dp))
            ButtonDefault(text = "Ingresar", color = GreenPrincipalColor, enabled = true) {
            }
        }
    }
}