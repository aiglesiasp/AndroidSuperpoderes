package com.aiglesiaspubill.androidsuperpoderes.flow

import android.util.Log
import kotlinx.coroutines.flow.*

class EjercicioFLow {

    //FLOW QUE EMITA UN STRING POR CADA VALOR INICIAL DE UN LISTADO DE SUPERHEROES APLICANDO
    //LAS TRANSFORMACIONES NECESARIAS PARA CONSEGUI LO SIGUIENTE
    // "Hola Goku, estas en la posicion 1"
    suspend fun ejercicio1() {
        val intFlow = flow {
            emit("Maestro Roshi")
            emit("Mr. Satán")
            emit("Krilin")
            emit("Goku")
            emit("Vegeta")
            emit("Bulma")
            emit("Freezer")
            emit("Beerus")
            emit("Piccolo")
            emit("Kaito")
            emit("Raditz")
            emit("Célula")
            emit("Trunks del Futuro")
            emit("Quake (Daisy Johnson)")
            emit("starry night")
            emit("San Goku")
            emit("Gohan Prime")
            emit("Broly")
        }.map { "Hola $it estas en la posicion "}
            .collectIndexed { index, value ->
                Log.d("FLOW", value + index)
            }
    }

    //FLOW QUE EMITA SOLO EL NUMERO DE LETRAS DE UN LISTADO DE SUPERHEROES QUE CONTIENEN UN NUMERO DE LETRAS IMPAR
    suspend fun ejercicio2() {
        val intFlow = flow {
            emit("Maestro Roshi")
            emit("Mr. Satán")
            emit("Krilin")
            emit("Goku")
            emit("Vegeta")
            emit("Bulma")
            emit("Freezer")
            emit("Beerus")
            emit("Piccolo")
            emit("Kaito")
            emit("Raditz")
            emit("Célula")
            emit("Trunks del Futuro")
            emit("Quake (Daisy Johnson)")
            emit("starry night")
            emit("San Goku")
            emit("Gohan Prime")
            emit("Broly")
        }.filter { (it.length%2) != 0 }
            .map {it.length}
            .collect() { Log.d("FLOW", it.toString()) }
    }

    //FLOW QUE EMITA LOS DOS PRIMEROS NOMBRES DE SUPERHEROES CON UN NUMERO DE LETRAS IMPART Y DEVUELVA UN SOLO STRING DEL ESTILO "BIENVENIDOS, Mr.Satan y Bulma"
    suspend fun ejercicio3() {
        val intFlow = flow {
            emit("Maestro Roshi")
            emit("Mr. Satán")
            emit("Krilin")
            emit("Goku")
            emit("Vegeta")
            emit("Bulma")
            emit("Freezer")
            emit("Beerus")
            emit("Piccolo")
            emit("Kaito")
            emit("Raditz")
            emit("Célula")
            emit("Trunks del Futuro")
            emit("Quake (Daisy Johnson)")
            emit("starry night")
            emit("San Goku")
            emit("Gohan Prime")
            emit("Broly")
        }.filter { (it.length%2) != 0 }
            .take(2)
            .fold("Bienvenidos, ") { acc, value ->
                acc + " y " + value
            }
        Log.d("FLOW", intFlow)
    }
}
