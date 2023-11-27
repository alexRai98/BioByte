package com.biobyte.android.loginBioByte.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biobyte.android.shared.ui.ButtonDefault
import com.biobyte.android.shared.ui.HeaderText
import com.biobyte.android.shared.ui.Input
import com.biobyte.android.ui.theme.GreenPrincipalColor

@Preview
@Composable
fun UserCreation() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        HeaderText(title = "Registra ha tu usuario", backStep = { }, showCloseButton = false) { }
        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(top = 30.dp)
        ) {
            Input(value = "", label = "Nombres") { }
            Spacer(modifier = Modifier.height(10.dp))
            Input(value = "", label = "Apellidos") { }
            Spacer(modifier = Modifier.height(10.dp))
            Input(value = "", label = "DNI") { }
            Spacer(modifier = Modifier.height(10.dp))
            Input(value = "", label = "Contraseña") { }
            Spacer(modifier = Modifier.height(10.dp))
            Input(value = "", label = "Confimación de contraseña") { }
            Spacer(modifier = Modifier.height(25.dp))
            ButtonDefault(
                text = "Registrar", color = GreenPrincipalColor,
                enabled = true
            ) {

            }
        }
    }
}