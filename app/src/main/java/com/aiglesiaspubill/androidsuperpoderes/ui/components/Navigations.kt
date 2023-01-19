package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import kotlin.math.log


@Composable
fun ScreenHome(navController: NavController) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        Button(onClick = { navController.navigate(ScreensExample.List.route)}, modifier = Modifier.align(Alignment.Center)) {
            Text("START")
        }
    }
}

@Preview
@Composable
fun ScreenList(onButtonClick: (Int, Boolean) -> (Unit) = {_,_ -> }) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)) {
        Button(onClick = { onButtonClick(1, true) }, modifier = Modifier.align(Alignment.Center)) {
            Text("Go to Detail...")
        }
    }
}

@Composable
fun ScreenDetail(id: Int, logged: Boolean = false, onButtonClick: () -> (Unit) = {}) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)) {
        Text("Soy Aitor y tengo el id: $id y el logged es $logged", modifier = Modifier.align(Alignment.TopCenter))
        Button(onClick = { onButtonClick() }, modifier = Modifier.align(Alignment.Center)) {
            Text("Ir atras")
        }
    }
}

sealed class ScreensExample(val route: String) {
    //Clase 1
    object Home: ScreensExample(HOME_BASE_ROUTE)
    //Clase 2
    object List: ScreensExample(LIST_BASE_ROUTE)
    //Clase 3
    object Detail: ScreensExample(DETAIL_ROUTE) {
        const val ARG_ID = "ARG_ID"
        const val ARG_LOGGED = "ARG_LOGGED"
        fun createRoute (id: Int, logged: Boolean?):String {
            return "$DETAIL_BASE_ROUTE/$id?logged=${logged}"
        }
    }

    companion object {
        private const val HOME_BASE_ROUTE = "home"
        private const val LIST_BASE_ROUTE = "list"
        private const val DETAIL_BASE_ROUTE = "detail"
        private const val DETAIL_ROUTE = "detail/{id}?logged={logged}"

    }
}