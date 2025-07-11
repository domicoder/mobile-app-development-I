package com.domicoder.domijetpackcompose

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.domicoder.domijetpackcompose.ui.theme.DomiJetpackComposeTheme

// This file is created for study and practice purposes.
// It is not recommended to use it in production.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DomiJetpackComposeTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)) { innerPadding ->
                    Column(modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                    ) {
                        MiPrimerComposable(
                            message = "¡Hola, Jetpack Compose!",
                            modifier = Modifier.padding(8.dp)
                        ) // Ejercicio 1
                        TarjetaDePresentacion(modifier = Modifier.padding(8.dp)) // Ejercicio 2
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.End
                        ) {
                            IconosSociales() // Ejercicio 3
                        }
                        ArticuloSimple() // Ejercicio 4
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            PerfilDeUsuario(modifier = Modifier.padding(8.dp)) // Ejercicio 5
                        }
                        CuadriculaSimple(modifier = Modifier.padding(8.dp)) // Ejercicio 6
                        Column(modifier = Modifier.padding(8.dp)) { // Ejercicio 7
                            ItemDeRecibo()
                            ItemDeRecibo()
                            ItemDeRecibo()
                        }
                        Column(
                            modifier = Modifier
                                .padding(8.dp)

                        ) { // Ejercicio 8
                            BarraDeProgreso(0.2f, Modifier.padding(bottom = 8.dp)) // Ejercicio 8
                            BarraDeProgreso(0.6f, Modifier.padding(bottom = 8.dp)) // Ejercicio 8
                            BarraDeProgreso(0.4f, Modifier.padding(bottom = 8.dp)) // Ejercicio 8
                        }
                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                                .border(2.dp, Color.Black)
                        ) {
                            TarjetaDeNoticia(title = "Color verde", authorName = "Unknown", publishedDate = "10/07/2025", articleContent = stringResource(R.string.article_content))
                        }
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            GoToLogin(LocalContext.current)
                        }
                    }
                }
            }
        }
    }
}

//Ejercicio 1
@Composable
fun MiPrimerComposable(message: String, modifier: Modifier = Modifier) {
    Text(
        text = "$message!",
        modifier = modifier
    )
}

//Ejercicio 2
@Composable
fun TarjetaDePresentacion(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.End,
    ) {
        Text(
            text = "Yander Sanchez",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
        Text(
            text = "Fullstack Developer",
            fontSize = 12.sp,
            color = Color.Gray
        )
        Text(
            text = "sanchezyander@gmail.com",
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}

//Ejercicio 3
@Composable
fun IconosSociales() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            text = "\uD83D\uDC26",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(end  = 8.dp)
        )
        Text(
            text = "\uD83D\uDCBC",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(end  = 8.dp)
        )
        Text(
            text = "\uD83D\uDCF8",
            fontSize = 16.sp,
        )
    }
}

//Ejercicio 4
@Composable
fun ArticuloSimple() {
    Column {
        Text(
            text = "Aprendiendo Jetpack Compose",
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.exercise_4_article),
            fontSize = 12.sp,
            color = Color.Gray,
            textAlign = TextAlign.Justify,
        )
    }
}

//Ejercicio 5
@Composable
fun PerfilDeUsuario(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "\uD83E\uDDD1\u200D\uD83D\uDCBB",
                fontSize = 16.sp,
            )
            Spacer(modifier = Modifier.width(4.dp))
            Column {
                Text(
                    text = "domicoder",
                    fontSize = 12.sp,
                )
                Text(
                    text = "En linea",
                    fontSize = 10.sp,
                    color = Color.Gray
                )
            }
        }
    }
}

//Ejercicio 6
@Composable
fun CuadriculaSimple(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row {
            Box(
                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
                    .weight(1f)
                    .aspectRatio(1f)
                    .background(Color(0XFFbd2d30))
            )
            Box(
                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
                    .weight(1f)
                    .aspectRatio(1f)
                    .background(Color(0XFF0f2d5e)
                    )
            )
        }
        Row {
            Box(
                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
                    .weight(1f)
                    .aspectRatio(1f)
                    .background(Color(0XFF0f2d5e))
            )
            Box(
                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
                    .weight(1f)
                    .aspectRatio(1f)

                    .background(Color(0XFFbd2d30))

            )
        }
    }
}

//Ejercicio 7
@Composable
fun ItemDeRecibo(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Café Americano",
            modifier = modifier,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "$2.50",
            modifier = modifier,
            fontWeight = FontWeight.W300,
            fontSize = 12.sp,
        )
    }
}

//Ejercicio 8
@Composable
fun BarraDeProgreso(progreso: Float, modifier: Modifier = Modifier) {
    require(progreso in 0.0f..1.0f) { "'progreso' must be between 0.0 and 1.0" }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(16.dp)
            .background(Color.LightGray)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(progreso)
                .height(16.dp)
                .background(Color.Blue)
        )
    }
}

//Ejercicio 9
@Composable
fun TarjetaDeNoticia(title: String, authorName: String, publishedDate: String, articleContent: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .height(80.dp)
                .width(80.dp)
                .background(
                    color = Color.Green
                )
        )
        Text(
            text = title,
            modifier = modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
        )
        Row {
            Text(
                text = "Author name: $authorName",
                modifier = modifier,
                fontSize = 12.sp,
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Published date: $publishedDate",
                modifier = modifier,
                fontSize = 12.sp,
            )
        }
        Text(
            text = articleContent,
            modifier = modifier,
            fontSize = 12.sp,
        )
    }
}

//Ejercicio 10
@Composable
fun GoToLogin(context: Context) {
    Button (
        onClick = {
            val intent = Intent(context, PantallaLoginActivity::class.java)
            intent.putExtra("DATA-USERNAME", "domicoder")
            intent.putExtra("DATA-PASSWORD", "Password-Inseguro")
            context.startActivity(intent)
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color(0XFF0F9D58)),
    ) {
        Text(text = "Ir a Pantalla Login")
    }
}

// –– Composable Preview –– –– –– –– –– –– ––

//Ejercicio 1
@Preview(showBackground = true, name =  "Mi Primer Composable")
@Composable
fun MiPrimerComposablePreview() {
    DomiJetpackComposeTheme {
        MiPrimerComposable("MiPrimerComposable")
    }
}

//Ejercicio 2
@Preview(showBackground = true)
@Composable
fun TarjetaDePresentacionPreview() {
    DomiJetpackComposeTheme {
        TarjetaDePresentacion()
    }
}

//Ejercicio 3
@Preview(showBackground = true)
@Composable
fun IconosSocialesPreview() {
    DomiJetpackComposeTheme {
        IconosSociales()
    }
}

//Ejercicio 4
@Preview(showBackground = true)
@Composable
fun ArticuloSimplePreview() {
    DomiJetpackComposeTheme {
        ArticuloSimple()
    }
}

//Ejercicio 5
@Preview(showBackground = true)
@Composable
fun PerfilDeUsuarioPreview() {
    DomiJetpackComposeTheme {
        PerfilDeUsuario()
    }
}

//Ejercicio 6
@Preview(showBackground = true)
@Composable
fun CuadriculaSimplePreview() {
    DomiJetpackComposeTheme {
        CuadriculaSimple()
    }
}

//Ejercicio 7
@Preview(showBackground = true)
@Composable
fun ItemDeReciboPreview() {
    DomiJetpackComposeTheme {
        ItemDeRecibo()
    }
}

//Ejercicio 8
@Preview(showBackground = true)
@Composable
fun BarraDeProgresoPreview() {
    DomiJetpackComposeTheme {
        BarraDeProgreso(0.5f)
    }
}

//Ejercicio 9
@Preview(showBackground = true)
@Composable
fun TarjetaDeNoticiaPreview() {
    DomiJetpackComposeTheme {
        TarjetaDeNoticia(title = "Color verde", authorName = "Unknown", publishedDate = "10/07/2025", articleContent = stringResource(R.string.article_content))
    }
}

//Ejercicio 10
//PantallaLoginActivity.kt
