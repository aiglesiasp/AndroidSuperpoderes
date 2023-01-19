
@file:OptIn(ExperimentalFoundationApi::class)

package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/*//*
/@Preview(showBackground = true)
@Composable
fun MyLazyrGrids() {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")

    LazyVerticalGrid(cells = GridCells.Adaptive(50.dp)) {
        items(heros) {
            Item(it)
        }
    }
}

//@Preview(showSystemUi = true, heightDp = 720, widthDp = 360)
@Composable
fun MyLazyGridsVertical() {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")
    LazyVerticalGrid(cells = GridCells.Fixed(1), modifier = Modifier.fillMaxSize()) {
        items(heros) {
            Item(it)
        }
    }
}*//*


@Composable
fun MyGridExercise(isTablet: Boolean, isVertical: Boolean) {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")
    when {
        isTablet && isVertical -> MyTabletVerticalView(heros = heros)
        isTablet && !isVertical -> MyTabletHorizontalView(heros = heros)
        else -> MyMobileView(heros = heros)
    }
    if(isTablet) {
        val cells = if (isVertical) GridCells.Fixed(3) else GridCells.Adaptive(100.dp)
        MyTablet(heros = heros, cells = cells)
    }
}


@Preview(showSystemUi = true)
@Composable
fun MyMobileViewPreview() {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")
    MyMobileView(heros = heros)
}
@Composable
fun MyMobileView(heros: List<String>) {
    LazyColumn(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,) {
        itemsIndexed(heros) { index, hero ->
            Item("Position $index with $hero")
        }

    }
}
@Preview(showBackground = true, heightDp = 360, widthDp = 720)
@Composable
fun MyTabletHorizontalViewPreview() {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")
    MyTabletHorizontalView(heros = heros)
}

@Composable
fun MyTabletHorizontalView(heros: List<String>) {
    LazyVerticalGrid(cells = GridCells.Adaptive(200.dp)) {
        itemsIndexed(heros) { index, hero ->
            Item("Position $index with $hero")
        }
    }

}
@Preview
@Composable
fun MyTabletVerticalViewPreview() {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")
    MyTabletVerticalView(heros = heros)
}

@Composable
fun MyTabletVerticalView(heros: List<String>) {
    LazyVerticalGrid(cells = GridCells.Fixed(3)) {
        itemsIndexed(heros) { index, hero ->
            Item("Position $index with $hero")
        }
    }
}

@Composable
fun MyTablet(heros: List<String>, cells: GridCells) {
    LazyVerticalGrid(cells = cells) {
        itemsIndexed(heros) { index, hero ->
            Item("Position $index with $hero")
        }
    }
}

*/