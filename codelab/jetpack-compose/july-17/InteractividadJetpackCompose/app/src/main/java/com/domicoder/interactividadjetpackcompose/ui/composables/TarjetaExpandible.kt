package com.domicoder.interactividadjetpackcompose.ui.composables


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.domicoder.interactividadjetpackcompose.ui.theme.Blue
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme

@Composable
fun TarjetaExpandible(content: @Composable () -> Unit, modifier: Modifier = Modifier,  ) {
    var expandido by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .clickable() { expandido = !expandido }
            .border(
                BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                RoundedCornerShape(12.dp)
            )
            .padding(16.dp),        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Título de la tarjeta",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge
        )

        if (expandido) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Este es el contenido detallado que se muestra al expandir la tarjeta.",
                style = MaterialTheme.typography.bodyLarge
            )
        }
        Spacer(modifier = Modifier.height(32.dp))
    }
    Column(
        modifier = modifier.fillMaxSize().padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaExpandiblePreview() {
    InteractividadJetpackComposeTheme {
        TarjetaExpandible(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}