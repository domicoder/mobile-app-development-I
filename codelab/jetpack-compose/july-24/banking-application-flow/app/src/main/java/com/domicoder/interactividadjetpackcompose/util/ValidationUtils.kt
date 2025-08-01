package com.domicoder.interactividadjetpackcompose.util

import android.util.Patterns

object ValidationUtils {
    
    fun isValidEmail(email: String): Boolean {
        return email.isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    
    fun isValidName(name: String): Boolean {
        return name.isNotBlank() && name.length >= 2 && name.matches(Regex("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$"))
    }
    
    fun isValidIncome(income: String): Boolean {
        return try {
            val incomeValue = income.toDoubleOrNull()
            incomeValue != null && incomeValue > 0
        } catch (e: NumberFormatException) {
            false
        }
    }
    
    fun formatCurrency(amount: String): String {
        return try {
            val value = amount.toDoubleOrNull()
            if (value != null) {
                "%.2f".format(value)
            } else {
                amount
            }
        } catch (e: NumberFormatException) {
            amount
        }
    }
} 