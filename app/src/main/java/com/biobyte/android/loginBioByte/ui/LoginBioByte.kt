package com.biobyte.android.loginBioByte.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.biobyte.android.R
import com.biobyte.android.ui.theme.CreamPrincipalColor
import com.biobyte.android.ui.theme.GreenLowPrincipalColor
import com.biobyte.android.ui.theme.GreenPrincipalColor
import com.biobyte.android.ui.theme.GreyLabel
import com.biobyte.android.shared.ui.ButtonDefault

@Preview
@OptIn(ExperimentalMaterial3Api::class)
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
                painterResource(id = R.drawable.logo_bio_byte_login),
                contentDescription = "", modifier = Modifier.size(120.dp)
            )
            Spacer(modifier = Modifier.height(40.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Usuario", color = GreyLabel) }, modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = GreenPrincipalColor,
                    unfocusedBorderColor = GreenLowPrincipalColor
                )
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("Contraseña", color = GreyLabel) }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 25.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = GreenPrincipalColor,
                    unfocusedBorderColor = GreenLowPrincipalColor
                )
            )
            ButtonDefault(text = "Ingresar", color = GreenPrincipalColor, enabled = true) {
            }
        }
    }
}