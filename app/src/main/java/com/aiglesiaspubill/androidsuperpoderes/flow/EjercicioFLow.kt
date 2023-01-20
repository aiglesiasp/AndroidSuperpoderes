package com.aiglesiaspubill.androidsuperpoderes.flow

import android.util.Log
import kotlinx.coroutines.flow.*

class EjercicioFLow {

    //FLOW QUE EMITA UN STRING POR CADA VALOR INICIAL DE UN LISTADO DE SUPERHEROES APLICANDO
    //LAS TRANSFORMACIONES NECESARIAS PARA CONSEGUI LO SIGUIENTE
    // "Hola Goku, estas en la posicion 1"
    suspend fun flowExercise1Bis() {
        val heroList = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta",
            "Bulma",
            "Freezer",
            "Beerus",
            "Piccolo",
            "Kaito",
            "Raditz",
            "Célula",
            "Trunks del Futuro",
            "Quake (Daisy Johnson)",
            "starry night",
            "San Goku",
            "Gohan Prime",
            "Broly"
        )

        heroList.asFlow().map { "Hola $it, estás en la posición " }
            .collect {
                Log.d("FLOW", "$it${heroList.indexOf(it)}")
            }
    }

    suspend fun flowExercise1() {
        val heroList = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta",
            "Bulma",
            "Freezer",
            "Beerus",
            "Piccolo",
            "Kaito",
            "Raditz",
            "Célula",
            "Trunks del Futuro",
            "Quake (Daisy Johnson)",
            "starry night",
            "San Goku",
            "Gohan Prime",
            "Broly",
        )

        heroList.asFlow()
            .map { "Hola $it, estás en la posición " }
            .collectIndexed { index, value ->
                Log.d("FLOW", "$value$index")
            }
    }

    //FLOW QUE EMITA SOLO EL NUMERO DE LETRAS DE UN LISTADO DE SUPERHEROES QUE CONTIENEN UN NUMERO DE LETRAS IMPAR
    suspend fun flowExercise2Bis() {
        val heroList = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta",
            "Bulma",
            "Freezer",
            "Beerus",
            "Piccolo",
            "Kaito",
            "Raditz",
            "Célula",
            "Trunks del Futuro",
            "Quake (Daisy Johnson)",
            "starry night",
            "San Goku",
            "Gohan Prime",
            "Broly"
        )

        heroList.asFlow()
            .filter { it.length % 2 != 0 }
            .map { it.length }
            .collect{
                Log.d("FLOW", it.toString())
            }
    }

    suspend fun flowExercise2() {
        val heroList = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta",
            "Bulma",
            "Freezer",
            "Beerus",
            "Piccolo",
            "Kaito",
            "Raditz",
            "Célula",
            "Trunks del Futuro",
            "Quake (Daisy Johnson)",
            "starry night",
            "San Goku",
            "Gohan Prime",
            "Broly",
        )

        heroList.asFlow()
            .filter { it.length % 2 == 0 }
            .map { it.length }
            .collect {
                Log.d("FLOW", "$it")
            }
    }

    //FLOW QUE EMITA LOS DOS PRIMEROS NOMBRES DE SUPERHEROES CON UN NUMERO DE LETRAS IMPART Y DEVUELVA UN SOLO STRING DEL ESTILO "BIENVENIDOS, Mr.Satan y Bulma"
    suspend fun flowExercise3Bis() {
        val heroList = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta",
            "Bulma",
            "Freezer",
            "Beerus",
            "Piccolo",
            "Kaito",
            "Raditz",
            "Célula",
            "Trunks del Futuro",
            "Quake (Daisy Johnson)",
            "starry night",
            "San Goku",
            "Gohan Prime",
            "Broly",
        )

        val result = heroList.asFlow()
            .filter { it.length % 2 != 0 }
            .take(2)
            .fold(""){ acc, value ->
                acc + " y " + value
            }

        Log.d("FLOW", "Bienvenidos, ${result.substring(3)}")
    }

    suspend fun flowExercise3() {
        val heroList = listOf(
            "Maestro Roshi",
            "Mr. Satán",
            "Krilin",
            "Goku",
            "Vegeta",
            "Bulma",
            "Freezer",
            "Beerus",
            "Piccolo",
            "Kaito",
            "Raditz",
            "Célula",
            "Trunks del Futuro",
            "Quake (Daisy Johnson)",
            "starry night",
            "San Goku",
            "Gohan Prime",
            "Broly",
        )

        val result = heroList.asFlow()
            .filter { it.length % 2 != 0 }
            .take(2)
            .fold("Bienvenidos,") { acc, value ->
                "$acc $value y"
            }

        Log.d("FLOW", result.dropLast(2))
    }
}
