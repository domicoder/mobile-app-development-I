package com.domicoder.interactividadjetpackcompose.ui.composables


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.domicoder.interactividadjetpackcompose.ui.theme.Blue
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme
import kotlin.random.Random

@Composable
fun CambiadorDeColor(content: @Composable () -> Unit, modifier: Modifier = Modifier,  ) {
    var color by remember { mutableStateOf(Color.Gray) }

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(10.dp))
        GeneralButton("Cambiar Color", color = Blue, {
            color = Color(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
        })
        Spacer(modifier = Modifier.height(32.dp))
        content()
    }
}

@Preview(showBackground = true)
@Composable
fun CambiadorDeColorPreview() {
    InteractividadJetpackComposeTheme {
        CambiadorDeColor(
            content = {
                Text(text = "My Other component")
            }
        )
    }
}