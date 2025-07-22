package com.domicoder.interactividadjetpackcompose.ui.composables


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
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
fun EditorDeTextoConContador(content: @Composable () -> Unit, modifier: Modifier = Modifier) {
    var texto by remember { mutableStateOf("") }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        content()
        Spacer(modifier = Modifier.height(24.dp))
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Escribe aquí...") },
            singleLine = false,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "${texto.length} / 140",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.align(Alignment.End),
            color = if (texto.length > 140) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onBackground
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EditorDeTextoConContadorPreview() {
    InteractividadJetpackComposeTheme {
        EditorDeTextoConContador(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}