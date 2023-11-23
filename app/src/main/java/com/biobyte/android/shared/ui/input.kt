package com.biobyte.android.shared.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.biobyte.android.ui.theme.GreenLowPrincipalColor
import com.biobyte.android.ui.theme.GreenPrincipalColor
import com.biobyte.android.ui.theme.GreyLabel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Input(value: String, label: String, onValueChange: () -> Unit) {
    OutlinedTextField(
        value = value,
        onValueChange = {onValueChange},
        label = { Text( label, color = GreyLabel) }, modifier = Modifier
            .fillMaxWidth(),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = GreenPrincipalColor,
            unfocusedBorderColor = GreenLowPrincipalColor
        )
    )
}