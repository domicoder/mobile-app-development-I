package com.domicoder.interactividadjetpackcompose.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.domicoder.interactividadjetpackcompose.ui.theme.Green
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme

@Composable
fun GeneralButton(text: String, color: Color, onClick: () -> Unit, modifier: Modifier = Modifier, isEnabled: Boolean = true ) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onClick,
            colors = ButtonDefaults.buttonColors(containerColor = color),
            enabled = isEnabled
        ) {
            Text(
                text = text
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GeneralButtonPreview() {
    InteractividadJetpackComposeTheme {
        GeneralButton("Ejercicio 1", Green, {})
    }
}