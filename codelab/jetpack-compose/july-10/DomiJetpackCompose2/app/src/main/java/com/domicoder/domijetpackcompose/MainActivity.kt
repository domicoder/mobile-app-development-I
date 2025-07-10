package com.domicoder.domijetpackcompose

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.util.rangeTo
import com.domicoder.domijetpackcompose.ui.theme.DomiJetpackComposeTheme

// This file is created for study and practice purposes.
// It is not recommended to use it in production.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DomiJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize().padding(16.dp)) { innerPadding ->
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
                        IconosSociales(modifier = Modifier.padding(8.dp)) // Ejercicio 3
                        ArticuloSimple(modifier = Modifier.padding(8.dp)) // Ejercicio 4
                        PerfilDeUsuario(modifier = Modifier.padding(8.dp)) // Ejercicio 5
                        CuadriculaSimple(modifier = Modifier.padding(8.dp)) // Ejercicio 6
                        Column(modifier = Modifier.padding(8.dp)) { // Ejercicio 7
                            ItemDeRecibo()
                            ItemDeRecibo()
                            ItemDeRecibo()
                        }
                        Column(modifier = Modifier.padding(8.dp)) { // Ejercicio 8
                            BarraDeProgreso(0.2f) // Ejercicio 8
                            BarraDeProgreso(0.3f) // Ejercicio 8
                            BarraDeProgreso(0.4f) // Ejercicio 8
                        }
                        TarjetaDeNoticia(title = "Color verde", authorName = "Unknown", publishedDate = "10/07/2025", articleContent = stringResource(R.string.article_content),)
                        PantallaLogin()
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
    Column {
        Text(
            text = "Yander Sanchez",
            modifier = modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
        )
        Text(
            text = "Fullstack Developer",
            modifier = modifier,
            fontSize = 12.sp,
            color = Color.Gray
        )
        Text(
            text = "sanchezyander@gmail.com",
            modifier = modifier,
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}

//Ejercicio 3
@Composable
fun IconosSociales(modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        Text(
            text = "\uD83D\uDC26",
            fontSize = 16.sp,
            modifier = modifier
        )
        Text(
            text = "\uD83D\uDCBC",
            fontSize = 16.sp,
            modifier = modifier
        )
        Text(
            text = "\uD83D\uDCF8",
            fontSize = 16.sp,
            modifier = modifier
        )
    }
}

//Ejercicio 4
@Composable
fun ArticuloSimple(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(0.dp)) {
        Text(
            text = "Aprendiendo Jetpack Compose",
            modifier = modifier,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(R.string.exercise_4_article),
            modifier = modifier,
            fontSize = 12.sp,
            color = Color.Gray
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
                    .background(MaterialTheme.colorScheme.error)
            )
            Box(
                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
                    .weight(1f)
                    .aspectRatio(1f)
                    .background(
                        color = Color.Blue
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
                    .background(
                        color = Color.Blue
                    )
            )
            Box(
                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
                    .weight(1f)
                    .aspectRatio(1f)

                    .background(MaterialTheme.colorScheme.error)

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
        modifier = Modifier.fillMaxWidth().height(16.dp).background(Color.LightGray)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(progreso).height(16.dp).background(Color.Blue)
        )
    }
}


//Ejercicio 9
@Composable
fun TarjetaDeNoticia(title: String, authorName: String, publishedDate: String, articleContent: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(10.dp).border(2.dp, Color.Black)) {
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
fun PantallaLogin(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().border(2.dp, Color.Black).height(200.dp),
    ) {
        Text(
            text = "Bienvenido",
            modifier = modifier,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Usuario",
            modifier = modifier,
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Contraseña",
            modifier = modifier,
            fontSize = 12.sp,
        )
        Spacer(modifier = Modifier.weight(2f))
        Text(
            text = "Iniciar Sesión",
            modifier = modifier,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
        )
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
        TarjetaDeNoticia(title = "Color verde", authorName = "Unknown", publishedDate = "10/07/2025", articleContent = stringResource(R.string.article_content),)
    }
}

//Ejercicio 10
@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    DomiJetpackComposeTheme {
        PantallaLogin()
    }
}


