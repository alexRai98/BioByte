package com.biobyte.android.shared.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.biobyte.android.ui.theme.GreyDisableButton
import com.biobyte.android.ui.theme.GreySoft
import com.biobyte.android.ui.theme.NunitoTypography

@Composable
fun ButtonDefault(text: String, color: Color, enabled: Boolean, handleClick: () -> Unit) {
    Button(
        enabled = enabled,
        onClick = handleClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = Color.White,
            disabledContainerColor = GreyDisableButton,
            disabledContentColor = GreySoft,
        ),
        modifier = Modifier
            .fillMaxWidth().height(48.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(text = text, style = NunitoTypography.labelMedium)
    }
}