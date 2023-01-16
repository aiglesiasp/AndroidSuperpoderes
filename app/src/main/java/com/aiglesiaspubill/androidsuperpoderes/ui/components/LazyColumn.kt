package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglesiaspubill.androidsuperpoderes.R

@Preview(showBackground = true)
@Composable
fun MyLazyColumn() {
    LazyColumn(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        item {
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "HOLA",
            modifier = Modifier.background(Color.Black))
        }


        items(10) {
            Text(text = "Texto $it", modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        }
        
        item { 
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cargar mas...")
                
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyLazyColumn2() {
    val heros = listOf("Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula", "Goku", "Vegeta", "Celula")

    LazyColumn(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,) {
        itemsIndexed(heros) { index, hero ->
            Item("Position $index with $hero")
        }

    }
}


@Preview
@Composable
fun Item (hero: String = "Goku") {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.compose),
            contentDescription = "Compose ICON",
            modifier = Modifier.size(100.dp)
        )
        Text(text = hero, Modifier.padding(8.dp), style = MaterialTheme.typography.h5)
    }
}