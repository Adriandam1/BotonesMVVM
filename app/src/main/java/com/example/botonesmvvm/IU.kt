
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.example.botonesmvvm.MyViewModel
import com.example.mvvm_basic.Colores
import java.lang.StrictMath.random

@Composable
fun IU(miViewModel: MyViewModel) {
    // creo un boton
    Boton(miViewModel)
}

/**
 * Crea un boton
 */
// estoy usando un enum, tanto para el color como para el texto, el enum lo pondre en el model
@Composable
fun Boton(miViewModel: MyViewModel) {

    var colorName by remember { mutableStateOf("") }
    var colorValue by remember { mutableStateOf(Color.White) }
    var colorNumber by remember { mutableIntStateOf(0)  }
    // para que sea mas facil la etiqueta del log
    val TAG_LOG: String = "miDebug"

    Column(modifier = Modifier.padding(vertical = 200.dp)) {
        // ROW 1 AZUL Y ROJO
        Row {

            Button(
                // utilizamos el color del enum
                //colors =  ButtonDefaults.buttonColors(enum_color.color),
                //colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),

                colors = ButtonDefaults.buttonColors(containerColor = Colores.CLASE_AZUL.color),
                onClick = {
                    colorName = Colores.CLASE_AZUL.txt
                    colorValue = Colores.CLASE_AZUL.color
                    colorNumber = Colores.CLASE_AZUL.numero
                    //Log.d(TAG_LOG, "PROBANDOOOOOOOOOOOOOOOO $colorName")
                    miViewModel.crearRandom()
                    //ponemos la _ para diferenciarlo del otro numero
                    //genera numero random de 0 a 10
                    var _numero = (0..10).random()
                    Log.d(TAG_LOG, "Dentro del onClick $_numero")
                },

                //HACER EL BOTON CUADRADO
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RoundedCornerShape(0.dp)), // Esquinas cuadradas
                shape = RoundedCornerShape(0.dp) // Forma cuadrada
            )  {
                Text(text = Colores.CLASE_AZUL.txt, fontSize = 20.sp)
            }

            Button(
                // utilizamos el color del enum
                //colors =  ButtonDefaults.buttonColors(enum_color.color),

                //colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                colors = ButtonDefaults.buttonColors(containerColor = Colores.CLASE_ROJO.color),
                onClick = {
                    colorName = Colores.CLASE_ROJO.txt
                    colorValue = Colores.CLASE_ROJO.color
                    colorNumber = Colores.CLASE_ROJO.numero
                    //Log.d(TAG_LOG, "PROBANDOOOOOOOOOOOOOOOO $colorName")
                    miViewModel.crearRandom()
                    //ponemos la _ para diferenciarlo del otro numero
                    //genera numero random de 0 a 10
                    var _numero = (0..10).random()
                    Log.d(TAG_LOG, "Dentro del onClick $_numero")
                },
                //HACER EL BOTON CUADRADO
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RoundedCornerShape(0.dp)), // Esquinas cuadradas
                shape = RoundedCornerShape(0.dp) // Forma cuadrada
            ) {
                // utilizamos el texto del enum
                Text(text = Colores.CLASE_ROJO.txt, fontSize = 20.sp)
            }
        }

        // ROW 2 AMARILLO Y VERDE
        Row {

            Button(
                // utilizamos el color del enum
                //colors =  ButtonDefaults.buttonColors(enum_color.color),

                colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow),
                onClick = {
                    colorName = Colores.CLASE_AMARILLO.txt
                    colorValue = Colores.CLASE_AMARILLO.color
                    colorNumber = Colores.CLASE_AMARILLO.numero
                    //Log.d(TAG_LOG, "PROBANDOOOOOOOOOOOOOOOO $colorName")
                    miViewModel.crearRandom()
                    //ponemos la _ para diferenciarlo del otro numero
                    //genera numero random de 0 a 10
                    var _numero = (0..10).random()
                    Log.d(TAG_LOG, "Dentro del onClick $_numero")
                },
                //HACER EL BOTON CUADRADO
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RoundedCornerShape(0.dp)), // Esquinas cuadradas
                shape = RoundedCornerShape(0.dp) // Forma cuadrada
            ) {
                // utilizamos el texto del enum
                Text(text = Colores.CLASE_AMARILLO.txt, fontSize = 20.sp)
            }

            Button(
                // utilizamos el color del enum
                //colors =  ButtonDefaults.buttonColors(enum_color.color),

                colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                onClick = {
                    colorName = Colores.CLASE_VERDE.txt
                    colorValue = Colores.CLASE_VERDE.color
                    colorNumber = Colores.CLASE_VERDE.numero
                    //Log.d(TAG_LOG, "PROBANDOOOOOOOOOOOOOOOO $colorName")
                    miViewModel.crearRandom()
                    //ponemos la _ para diferenciarlo del otro numero
                    //genera numero random de 0 a 10
                    var _numero = (0..10).random()
                    Log.d(TAG_LOG, "Dentro del onClick $_numero")
                },
                //HACER EL BOTON CUADRADO!
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = RoundedCornerShape(0.dp)), // Esquinas cuadradas
                shape = RoundedCornerShape(0.dp) // Forma cuadrada
            ) {
                // utilizamos el texto del enum
                Text(text = Colores.CLASE_VERDE.txt, fontSize = 20.sp)
            }
        }
        //Row 3 boton click
        Row (modifier = Modifier.padding(24.dp))  {
            //TextField(value = "hola", onValueChange = (String) -> Unit)
            TextField(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .fillMaxSize(), //rellena el maximo posible
                value = colorName, // Muestra el nombre del color
                onValueChange = {},
                label = { Text(text = "Color seleccionado: ", fontSize = 24.sp) }, //Texto del titulo del textflied
                textStyle = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold), // Texto del TextField
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = colorValue,
                    unfocusedContainerColor = colorValue,
                    disabledContainerColor = colorValue
                )
            )
        }
        }
    }


@Preview(showBackground = true)
@Composable
fun IUPreview() {
    IU(MyViewModel())
}