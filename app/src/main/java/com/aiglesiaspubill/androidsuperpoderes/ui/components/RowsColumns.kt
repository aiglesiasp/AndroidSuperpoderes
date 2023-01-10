package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun myRow() {
    Row(
        modifier = Modifier
            .size(80.dp)
            .background(Color.Gray)
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.width(5.dp))
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Black))
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Blue))
        Spacer(modifier = Modifier.width(5.dp))
    }
}

@Composable
fun myColumn() {
    Column(
        modifier = Modifier
            .size(80.dp)
            .background(Color.Gray)
            .padding(10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.width(5.dp))
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Black))
        Box(modifier = Modifier
            .size(10.dp)
            .background(Color.Blue))
        Spacer(modifier = Modifier.width(5.dp))
    }
}

@Composable
fun myWeightRow() {
    Row(modifier = Modifier.size(100.dp)) {
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.Green))
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.Black))
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.Blue))
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.Yellow))
    }
}


//EJERCICIO
@Preview
@Composable
fun myFigture() {
    Box(modifier = Modifier
        .size(400.dp)
        .background(Color.Gray))
    {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .background(Color.Green),
            horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween)
        {
            Row(modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End) {


                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp)
                        .background(Color.Blue)
                        .weight(1F)
                )

                Box(
                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)
                        .background(Color.Red)
                        .weight(1F)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color.Yellow)
                        .weight(1F)
                )

            }
        }
    }
}