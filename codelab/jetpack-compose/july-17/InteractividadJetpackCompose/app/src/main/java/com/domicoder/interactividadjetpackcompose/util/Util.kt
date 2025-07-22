package com.domicoder.interactividadjetpackcompose.util

import android.content.Context
import android.content.Intent
import com.domicoder.interactividadjetpackcompose.Exercise10Activity
import com.domicoder.interactividadjetpackcompose.Exercise1Activity
import com.domicoder.interactividadjetpackcompose.Exercise2Activity
import com.domicoder.interactividadjetpackcompose.Exercise3Activity
import com.domicoder.interactividadjetpackcompose.Exercise4Activity
import com.domicoder.interactividadjetpackcompose.Exercise5Activity
import com.domicoder.interactividadjetpackcompose.Exercise6Activity
import com.domicoder.interactividadjetpackcompose.Exercise7Activity
import com.domicoder.interactividadjetpackcompose.Exercise8Activity
import com.domicoder.interactividadjetpackcompose.Exercise9Activity
import com.domicoder.interactividadjetpackcompose.MainActivity

object Util {
    fun showMainActivity(context: Context) {
        val intent = Intent(context, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise1(context: Context) {
        val intent = Intent(context, Exercise1Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise2(context: Context) {
        val intent = Intent(context, Exercise2Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise3(context: Context) {
        val intent = Intent(context, Exercise3Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise4(context: Context) {
        val intent = Intent(context, Exercise4Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise5(context: Context) {
        val intent = Intent(context, Exercise5Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise6(context: Context) {
        val intent = Intent(context, Exercise6Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise7(context: Context) {
        val intent = Intent(context, Exercise7Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise8(context: Context) {
        val intent = Intent(context, Exercise8Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise9(context: Context) {
        val intent = Intent(context, Exercise9Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
    fun showExercise10(context: Context) {
        val intent = Intent(context, Exercise10Activity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) // optional, if using app context
        context.startActivity(intent)
    }
}