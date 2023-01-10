package com.aiglesiaspubill.androidsuperpoderes.ui

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview

//@Preview(showSystemUi = true)
@Composable
fun StateScreen() {
    val counter = mutableStateOf<Int>(0)
    Log.d("Counter_FUERA", counter.value.toString())
    Button(onClick = {
        Log.d("Counter_ANTES", counter.value.toString())
        counter.value = counter.value + 1
        Log.d("Counter_DESPUES", counter.value.toString())
    })
    {
        Text(text = "Contador $counter.value")
    }
}

@Preview(showSystemUi = true)
@Composable
fun StateScreenVersionRemember() {
    var counter by remember { mutableStateOf(0) }

    Log.d("Counter_FUERA", counter.toString())
    Button(onClick = {
        Log.d("Counter_ANTES", counter.toString())
        counter = counter + 1
        Log.d("Counter_DESPUES", counter.toString())
    })
    {
        Text(text = "Contador $counter")
    }
}

@Preview(showSystemUi = true)
@Composable
fun StateScreenVersion() {
    var counter by rememberSaveable { mutableStateOf(0) }

    Log.d("Counter_FUERA", counter.toString())
    Button(onClick = {
        Log.d("Counter_ANTES", counter.toString())
        counter = counter + 1
        Log.d("Counter_DESPUES", counter.toString())
    })
    {
        Text(text = "Contador $counter")
    }
}