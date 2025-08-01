package com.domicoder.interactividadjetpackcompose.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.domicoder.interactividadjetpackcompose.ui.viewmodel.CreditCardViewModel
import com.domicoder.interactividadjetpackcompose.util.ValidationUtils

@Composable
fun PantallaBienvenida(onNavigateToNext: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Solicitud de Tarjeta de Crédito", fontSize = 24.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Bienvenido a nuestro proceso de solicitud en línea. Es rápido, fácil y seguro.",
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onNavigateToNext) {
            Text("Iniciar Solicitud")
        }
    }
}

@Composable
fun PantallaDatosPersonales(
    onNavigateToNext: () -> Unit,
    viewModel: CreditCardViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    var nombre by remember { mutableStateOf(uiState.userData.nombre) }
    var email by remember { mutableStateOf(uiState.userData.email) }
    
    // Actualizar ViewModel cuando cambien los valores locales
    LaunchedEffect(nombre, email) {
        viewModel.updatePersonalData(nombre, email)
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Paso 1: Datos Personales", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = { Text("Nombre Completo") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            isError = uiState.personalDataErrors.containsKey("nombre"),
            supportingText = {
                if (uiState.personalDataErrors.containsKey("nombre")) {
                    Text(
                        text = uiState.personalDataErrors["nombre"] ?: "",
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Correo Electrónico") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            isError = uiState.personalDataErrors.containsKey("email"),
            supportingText = {
                if (uiState.personalDataErrors.containsKey("email")) {
                    Text(
                        text = uiState.personalDataErrors["email"] ?: "",
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        )
        
        // Mostrar información introducida
        if (nombre.isNotBlank() || email.isNotBlank()) {
            Spacer(modifier = Modifier.height(24.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        "Información introducida:",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    if (nombre.isNotBlank()) {
                        Text("Nombre: $nombre")
                    }
                    if (email.isNotBlank()) {
                        Text("Email: $email")
                    }
                }
            }
        }
        
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = onNavigateToNext,
            enabled = uiState.isPersonalDataValid
        ) {
            Text("Siguiente")
        }
    }
}

@Composable
fun PantallaDatosFinancieros(
    onNavigateToNext: () -> Unit,
    viewModel: CreditCardViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    var ingresos by remember { mutableStateOf(uiState.userData.ingresos) }
    
    // Actualizar ViewModel cuando cambie el valor local
    LaunchedEffect(ingresos) {
        viewModel.updateFinancialData(ingresos)
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Paso 2: Datos Financieros", fontSize = 22.sp)
        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = ingresos,
            onValueChange = { ingresos = it },
            label = { Text("Ingresos Mensuales (€)") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            isError = uiState.financialDataErrors.containsKey("ingresos"),
            supportingText = {
                if (uiState.financialDataErrors.containsKey("ingresos")) {
                    Text(
                        text = uiState.financialDataErrors["ingresos"] ?: "",
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        )
        
        // Mostrar información introducida
        if (ingresos.isNotBlank()) {
            Spacer(modifier = Modifier.height(24.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        "Información introducida:",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Ingresos mensuales: ${ValidationUtils.formatCurrency(ingresos)} €")
                }
            }
        }
        
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = onNavigateToNext,
            enabled = uiState.isFinancialDataValid
        ) {
            Text("Siguiente")
        }
    }
}

@Composable
fun PantallaConfirmacion(
    onNavigateToNext: () -> Unit,
    viewModel: CreditCardViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val userData = uiState.userData

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Paso 3: Confirmación", fontSize = 22.sp, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Por favor, revisa que toda la información sea correcta antes de enviar.",
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(24.dp))
        
        // Mostrar resumen de todos los datos
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    "Resumen de la solicitud:",
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(16.dp))
                
                if (userData.nombre.isNotBlank()) {
                    Text("Nombre: ${userData.nombre}")
                    Spacer(modifier = Modifier.height(8.dp))
                }
                if (userData.email.isNotBlank()) {
                    Text("Email: ${userData.email}")
                    Spacer(modifier = Modifier.height(8.dp))
                }
                if (userData.ingresos.isNotBlank()) {
                    Text("Ingresos mensuales: ${ValidationUtils.formatCurrency(userData.ingresos)} €")
                }
            }
        }
        
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onNavigateToNext) {
            Text("Finalizar y Enviar")
        }
    }
}

@Composable
fun PantallaExito(
    onNavigateToHome: () -> Unit,
    viewModel: CreditCardViewModel = viewModel()
) {
    // Limpiar datos cuando se complete el flujo
    LaunchedEffect(Unit) {
        viewModel.clearData()
    }
    
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("✅", fontSize = 64.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("¡Solicitud Enviada!", fontSize = 24.sp)
        Text("Hemos recibido tu solicitud y la procesaremos en breve.", textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = onNavigateToHome) {
            Text("Volver al Inicio")
        }
    }
}