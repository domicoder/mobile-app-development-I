package com.domicoder.interactividadjetpackcompose.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.domicoder.interactividadjetpackcompose.ui.theme.Green
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme

@Composable
fun EspejoDeTexto(content: @Composable () -> Unit, modifier: Modifier = Modifier ) {
    var texto by remember { mutableStateOf("") }
    Column(
        modifier = modifier,
    ) {
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Escribe algo...") },
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = "Tú estás escribiendo: $texto",
            modifier = Modifier.padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun EspejoDeTextoPreview() {
    InteractividadJetpackComposeTheme {
        EspejoDeTexto({})
    }
}