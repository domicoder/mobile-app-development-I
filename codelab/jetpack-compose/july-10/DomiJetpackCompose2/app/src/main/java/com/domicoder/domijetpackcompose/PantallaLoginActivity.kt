package com.domicoder.domijetpackcompose

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.Intent.getIntent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.domicoder.domijetpackcompose.ui.theme.DomiJetpackComposeTheme

class PantallaLoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val username = intent.getStringExtra("DATA-USERNAME") ?: ""
        val password = intent.getStringExtra("DATA-PASSWORD") ?: ""

        enableEdgeToEdge()
        setContent {
            DomiJetpackComposeTheme {
                Column(modifier = Modifier
                ) {
                    PantallaLogin(username, password)
                }
            }
        }
    }
}

//Ejercicio 10
@Composable
fun PantallaLogin(username: String? = null, password: String? = null) {
    var loginSuccess by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(
            text = "Bienvenido",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(100.dp))
        (if (loginSuccess) username else "Usuario")?.let {
            Text(
                text = "Usuario: $it",
                fontSize = 14.sp,
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        (if (loginSuccess) password else "Contraseña")?.let {
            Text(
                text = "Contraseña: $it",
                fontSize = 14.sp,
            )
        }
        Spacer(modifier = Modifier.height(60.dp))
        Button (onClick = {
            loginSuccess = true
        },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0F9D58)),
        ) {
            Text(
                text = "Iniciar Sesión",
                fontSize = 14.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    PantallaLogin("username", "password")
}