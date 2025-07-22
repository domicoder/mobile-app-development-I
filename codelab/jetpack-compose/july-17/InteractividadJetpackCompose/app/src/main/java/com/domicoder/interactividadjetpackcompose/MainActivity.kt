package com.domicoder.interactividadjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.domicoder.interactividadjetpackcompose.ui.composables.GeneralButton
import com.domicoder.interactividadjetpackcompose.ui.theme.Green
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme
import com.domicoder.interactividadjetpackcompose.util.Util

class MainActivity : ComponentActivity() {
//    val context =
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current // Should be used in a Inside Composable (like setContent)
            InteractividadJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(top = 24.dp)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            modifier = Modifier.padding(horizontal = 16.dp),
                            text = "10 Ejercicios de Estado e Interactividad en Jetpack Compose",
                            fontWeight = FontWeight(weight = 700)
                        )
                        Spacer(modifier = Modifier.height(32.dp))
                        GeneralButton(text = "Ver ejercicio 1 >", color = Green, onClick = { Util.showExercise1(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 2 >", color = Green, onClick = { Util.showExercise2(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 3 >", color = Green, onClick = { Util.showExercise3(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 4 >", color = Green, onClick = { Util.showExercise4(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 5 >", color = Green, onClick = { Util.showExercise5(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 6 >", color = Green, onClick = { Util.showExercise6(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 7 >", color = Green, onClick = { Util.showExercise7(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 8 >", color = Green, onClick = { Util.showExercise8(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 9 >", color = Green, onClick = { Util.showExercise9(context) }, modifier = Modifier.padding(bottom = 10.dp))
                        GeneralButton(text = "Ver ejercicio 10 >", color = Green, onClick = { Util.showExercise10(context) }, modifier = Modifier.padding(bottom = 10.dp))
                    }
                }
            }
        }
    }
}
