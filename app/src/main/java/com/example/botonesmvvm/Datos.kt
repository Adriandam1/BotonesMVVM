package com.example.mvvm_basic

import androidx.compose.ui.graphics.Color

// interesante que sea un singleton poq eu quiero dejar los datos y echarles mano cuando quiera
// poniendole object hacemos que sea un singleton
object Datos {
    var numero = 0

}
//Este es mi enum con los colores utilizados:
/**
 * Colores utilizados
 */
// elementos de colores: color que es de tipo color y ademas un txt que es uns string
enum class Colores(val numero: Int, val color: Color, val txt: String = "blanco") {
    CLASE_AZUL(numero = 1, color = Color.Blue, txt = "azul"),
    CLASE_ROJO(numero = 2, color = Color.Red, txt = "roxo"),
    CLASE_AMARILLO(numero = 3, color = Color.Yellow, txt = "melo"),
    CLASE_VERDE(numero = 4, color = Color.Green, txt = "verde")

}