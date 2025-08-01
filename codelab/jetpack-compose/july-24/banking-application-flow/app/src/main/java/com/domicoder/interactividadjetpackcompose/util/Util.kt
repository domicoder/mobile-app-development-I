package com.domicoder.interactividadjetpackcompose.util

import android.content.Context
import android.content.Intent
import com.domicoder.interactividadjetpackcompose.MainActivity

object Util {
    fun showMainActivity(context: Context) {
        val intent = Intent(context, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
}