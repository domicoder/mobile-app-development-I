package com.domicoder.interactividadjetpackcompose.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import com.domicoder.interactividadjetpackcompose.util.ValidationUtils

data class UserData(
    val nombre: String = "",
    val email: String = "",
    val ingresos: String = ""
)

data class CreditCardUiState(
    val userData: UserData = UserData(),
    val isPersonalDataValid: Boolean = false,
    val isFinancialDataValid: Boolean = false,
    val isLoading: Boolean = false,
    val personalDataErrors: Map<String, String> = emptyMap(),
    val financialDataErrors: Map<String, String> = emptyMap()
)

class CreditCardViewModel : ViewModel() {
    
    private val _uiState = MutableStateFlow(CreditCardUiState())
    val uiState: StateFlow<CreditCardUiState> = _uiState.asStateFlow()
    
    fun updatePersonalData(nombre: String, email: String) {
        val errors = mutableMapOf<String, String>()
        
        if (nombre.isNotBlank() && !ValidationUtils.isValidName(nombre)) {
            errors["nombre"] = "El nombre debe tener al menos 2 caracteres y solo letras"
        }
        
        if (email.isNotBlank() && !ValidationUtils.isValidEmail(email)) {
            errors["email"] = "Por favor, introduce un email válido"
        }
        
        _uiState.update { currentState ->
            currentState.copy(
                userData = currentState.userData.copy(
                    nombre = nombre,
                    email = email
                ),
                isPersonalDataValid = ValidationUtils.isValidName(nombre) && ValidationUtils.isValidEmail(email),
                personalDataErrors = errors
            )
        }
    }
    
    fun updateFinancialData(ingresos: String) {
        val errors = mutableMapOf<String, String>()
        
        if (ingresos.isNotBlank() && !ValidationUtils.isValidIncome(ingresos)) {
            errors["ingresos"] = "Por favor, introduce un valor válido mayor a 0"
        }
        
        _uiState.update { currentState ->
            currentState.copy(
                userData = currentState.userData.copy(
                    ingresos = ingresos
                ),
                isFinancialDataValid = ValidationUtils.isValidIncome(ingresos),
                financialDataErrors = errors
            )
        }
    }
    
    fun clearData() {
        _uiState.value = CreditCardUiState()
    }
    
    fun getPersonalData(): UserData {
        return _uiState.value.userData
    }
    
    fun getFinancialData(): UserData {
        return _uiState.value.userData
    }
} 