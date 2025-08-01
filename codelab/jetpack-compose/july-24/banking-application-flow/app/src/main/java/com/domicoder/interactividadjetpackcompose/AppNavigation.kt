package com.domicoder.interactividadjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.domicoder.interactividadjetpackcompose.ui.screens.*
import com.domicoder.interactividadjetpackcompose.ui.viewmodel.CreditCardViewModel

object AppRoutes {
    const val BIENVENIDA = "bienvenida"
    const val DATOS_PERSONALES = "datos_personales"
    const val DATOS_FINANCIEROS = "datos_financieros"
    const val CONFIRMACION = "confirmacion"
    const val EXITO = "exito"
}

@Composable
fun AppNavigation() {
    // Inicializa el NavController
    val navController = rememberNavController()
    
    // Compartir ViewModel entre todas las pantallas
    val viewModel: CreditCardViewModel = viewModel()

    // Configura el NavHost, definiendo el grafo de navegación
    NavHost(
        navController = navController,
        startDestination = AppRoutes.BIENVENIDA
    ) {
        composable(AppRoutes.BIENVENIDA) {
            PantallaBienvenida(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.DATOS_PERSONALES)
                }
            )
        }

        composable(AppRoutes.DATOS_PERSONALES) {
            PantallaDatosPersonales(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.DATOS_FINANCIEROS)
                },
                viewModel = viewModel
            )
        }

        composable(AppRoutes.DATOS_FINANCIEROS) {
            PantallaDatosFinancieros(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.CONFIRMACION)
                },
                viewModel = viewModel
            )
        }

        composable(AppRoutes.CONFIRMACION) {
            PantallaConfirmacion(
                onNavigateToNext = {
                    navController.navigate(AppRoutes.EXITO)
                },
                viewModel = viewModel
            )
        }

        composable(AppRoutes.EXITO) {
            PantallaExito(
                onNavigateToHome = {
                    // Limpia el back stack hasta la pantalla de bienvenida
                    navController.popBackStack(AppRoutes.BIENVENIDA, inclusive = false)
                },
                viewModel = viewModel
            )
        }
    }
}