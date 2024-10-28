package com.example.botonesmvvm

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mvvm_basic.Datos

//ponemos una "heredancia" a ViewModel
class MyViewModel: ViewModel() {
    //atributos de clase:

    // etiqueta para logcat
    private val TAG_LOG = "miDebug"

    var _numbers = mutableStateOf(0)



    /**
     * crear entero random
     */
    fun crearRandom() {
        _numbers.value = (0..10).random()
        Log.d(TAG_LOG, "creamos random ${_numbers.value}")
        actualizarNumero(_numbers.value)
    }

    // funcion que recibe un numero entero y hace un numero.set()
    fun actualizarNumero(numero: Int) {
        Log.d(TAG_LOG, "actualizamos numero en Datos")
        Datos.numero = numero
    }

}












