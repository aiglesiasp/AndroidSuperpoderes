package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBox() {
    Box(modifier = Modifier
        .size(400.dp)
        .background(Color.Green)) {

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.Red)
            .align(Alignment.Center))


        Box(modifier = Modifier
            .size(120.dp)
            .background(Color.Black)
            .align(Alignment.BottomStart))

        Box(modifier = Modifier
            .padding(10.dp)
            .size(100.dp)
            .background(Color.Blue)
            .align(Alignment.CenterEnd)
        )

        Box(modifier = Modifier
            .padding(10.dp)
            .size(80.dp)
            .background(Color.White)
            .align(Alignment.TopStart))

        Box(modifier = Modifier
            .height(320.dp)
            .width(80.dp)
            .background(Color.Gray)
            .align(Alignment.Center))
        
        Spacer(modifier = Modifier.size(10.dp))


    }
}