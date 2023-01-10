package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview
@Composable
fun MyText() {
    Text(text = "Hola Compose",
        modifier = Modifier
            .background(Color.Blue)
            .padding(10.dp)
    )
}

//@Preview
@Composable
fun MyTextSize() {
    Text(text = "Texto en 22sp", fontSize = 22.sp,
        modifier = Modifier
            .background(Color.Red)
    )
}

//@Preview
@Composable
fun MyCustomText() {
    Text(text = "Custom Text",
        fontSize = 22.sp,
        color = Color.Yellow,
        fontWeight = FontWeight.Bold,
        textDecoration = TextDecoration.combine(listOf(TextDecoration.Underline, TextDecoration.LineThrough))
    )
}


//@Preview(showSystemUi = true)
@Composable
fun MyCustomLongText() {
    Text(text = "Custom Long Custom Long Custom Long " +
            "Custom Long Custom Long Custom Long " +
            "Custom Long Custom Long Custom Long Custom Long" +
            "Custom Long Custom Long Custom Long Custom Long" +
            "Custom Long Custom Long Custom Long Custom Long" +
            "Custom Long Custom Long Custom Long Custom Long" +
            "Custom Long Custom Long Custom Long Custom Long" +
            "Custom Long Custom Long Custom Long Custom Long",
        fontSize = 12.sp,
        color = Color.Black,
        maxLines = 4,
        overflow = TextOverflow.Ellipsis)
}

@Preview(showSystemUi = true)
@Composable
fun MyCustomStyleText() {

    Text(text = "Texto en H1",
    style = MaterialTheme.typography.h1.copy(color = Color.Blue, fontSize = 16.sp),
    textAlign = TextAlign.Center,
    modifier = Modifier.fillMaxSize())
}