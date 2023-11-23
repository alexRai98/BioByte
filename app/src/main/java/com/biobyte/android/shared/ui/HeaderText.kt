package com.biobyte.android.shared.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.biobyte.android.ui.theme.NunitoTypography

@Composable
fun HeaderText(
    title: String,
    backStep: () -> Unit,
    showArrowButton: Boolean = true,
    showCloseButton: Boolean = true,
    closeTransaction: () -> Unit,
) {
    Row(
        modifier = Modifier
            .padding(horizontal = 24.dp)
            .padding(top = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (showArrowButton) {
            IconButton(
                modifier = Modifier.size(29.dp),
                onClick = backStep,
                enabled = showArrowButton
            ) {
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowLeft,
                    contentDescription = "",
                    tint = Color.Black, modifier = Modifier.size(29.dp)
                )
            }
        } else {
            Spacer(modifier = Modifier.width(24.dp))
        }
        Text(
            modifier = Modifier.weight(1f),
            text = title,
            textAlign = TextAlign.Center,
            style = NunitoTypography.headlineSmall
        )
        if (showCloseButton) {
            IconButton(modifier = Modifier.size(25.dp), onClick = closeTransaction) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }
        } else {
            Spacer(modifier = Modifier.width(24.dp))
        }
    }
}