package com.domicoder.interactividadjetpackcompose.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.domicoder.interactividadjetpackcompose.ui.theme.Blue
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme

@Composable
fun MensajeSecreto(content: @Composable () -> Unit, modifier: Modifier = Modifier,  ) {
    var mostrarMensaje by remember { mutableStateOf(false) }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = if (mostrarMensaje) "Esto es un mensaje secreto" else "",
        )
        Spacer(modifier = Modifier.height(10.dp))
        GeneralButton("Revelar Secreto", color = Blue, { mostrarMensaje = !mostrarMensaje })
        Spacer(modifier = Modifier.height(32.dp))
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun MensajeSecretoPreview() {
    InteractividadJetpackComposeTheme {
        MensajeSecreto(
            content = {
                Text(text = "MensajeSecretoPreview")
            }
        )
    }
}