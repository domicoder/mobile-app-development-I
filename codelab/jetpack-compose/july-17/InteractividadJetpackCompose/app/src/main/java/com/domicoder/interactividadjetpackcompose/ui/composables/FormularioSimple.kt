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
fun FormularioSimple(content: @Composable () -> Unit, modifier: Modifier = Modifier,  ) {
    var texto by remember { mutableStateOf("") }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Ingresa algo...") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        GeneralButton("Enviar", color = Blue, {
            // Implement
        }, isEnabled = texto.isNotEmpty())
        Spacer(modifier = Modifier.height(32.dp))
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun FormularioSimplePreview() {
    InteractividadJetpackComposeTheme {
        FormularioSimple(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}