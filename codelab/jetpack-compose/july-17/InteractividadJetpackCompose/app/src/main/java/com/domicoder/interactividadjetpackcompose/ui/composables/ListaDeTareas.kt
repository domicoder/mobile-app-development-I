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
fun ListaDeTareas(content: @Composable () -> Unit, modifier: Modifier = Modifier) {
    var nuevaTarea by remember { mutableStateOf("") }
    val tareas = remember { mutableStateListOf<String>() }
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TextField(
                value = nuevaTarea,
                onValueChange = { nuevaTarea = it },
                label = { Text("Nueva tarea") },
                singleLine = true,
                modifier = Modifier.weight(1f)
            )
        }

        GeneralButton("Añadir", color = Blue, {
            if (nuevaTarea.isNotBlank()) {
                tareas.add(nuevaTarea)
                nuevaTarea = ""
            }
        })

        Spacer(modifier = Modifier.height(24.dp))

        LazyColumn {
            items(tareas) { tarea ->
                Text(
                    text = tarea,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
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
fun ListaDeTareasPreview() {
    InteractividadJetpackComposeTheme {
        ListaDeTareas(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}