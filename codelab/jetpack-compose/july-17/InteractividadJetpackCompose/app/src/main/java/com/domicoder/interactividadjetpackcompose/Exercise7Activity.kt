package com.domicoder.interactividadjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.domicoder.interactividadjetpackcompose.ui.composables.AppDeSaludos
import com.domicoder.interactividadjetpackcompose.ui.composables.FormularioSimple
import com.domicoder.interactividadjetpackcompose.ui.composables.GeneralButton
import com.domicoder.interactividadjetpackcompose.ui.theme.Green
import com.domicoder.interactividadjetpackcompose.ui.theme.InteractividadJetpackComposeTheme
import com.domicoder.interactividadjetpackcompose.util.Util

class Exercise7Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current // Should be used in a Inside Composable (like setContent)

            InteractividadJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column (
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        FormularioSimple(
                            content = {
                                GeneralButton(text = "< Regresar al inicio", color = Green, onClick = { Util.showMainActivity(context) })
                            }
                        )
                    }
                }
            }
        }
    }
}