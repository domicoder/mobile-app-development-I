package com.domicoder.interactividadjetpackcompose.ui.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.domicoder.interactividadjetpackcompose.ui.theme.Blue
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme

@Composable
fun ContadorDeClics(content: @Composable () -> Unit, modifier: Modifier = Modifier,  ) {
//    var contador by remember { mutableIntStateOf(0) } // Ejercicio 1
    var contador by rememberSaveable { mutableIntStateOf(0) } // Ejercicio 5 - solo poner esta linea
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = contador.toString()
        )
        Spacer(modifier = Modifier.height(10.dp))
        GeneralButton("Aumentar", color = Blue, { contador++ })
        Spacer(modifier = Modifier.height(32.dp))
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorDeClicsPreview() {
    InteractividadJetpackComposeTheme {
        ContadorDeClics(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}