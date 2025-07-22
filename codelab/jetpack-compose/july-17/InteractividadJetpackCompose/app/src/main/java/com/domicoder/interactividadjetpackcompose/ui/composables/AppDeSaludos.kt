package com.domicoder.interactividadjetpackcompose.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
fun AppDeSaludos(content: @Composable () -> Unit, modifier: Modifier = Modifier,  ) {
    var nombre by remember { mutableStateOf("") }
    // Estado para el saludo a mostrar
    var saludo by remember { mutableStateOf("") }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Tu nombre") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        GeneralButton("Saludar", color = Blue, {
            saludo = if (nombre.isNotBlank()) "¡Hola, $nombre!" else "Por favor, ingresa tu nombre."
        })
        Spacer(modifier = Modifier.height(32.dp))
        if (saludo.isNotEmpty()) {
            Text(
                text = saludo,
                style = MaterialTheme.typography.headlineMedium
            )
        }
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun AppDeSaludosPreview() {
    InteractividadJetpackComposeTheme {
        AppDeSaludos(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}