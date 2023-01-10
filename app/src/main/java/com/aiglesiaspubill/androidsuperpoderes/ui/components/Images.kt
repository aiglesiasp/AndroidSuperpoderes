package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglesiaspubill.androidsuperpoderes.R

//@Preview
@Composable
fun myImage() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Launcher icon")
}

//@Preview
@Composable
fun myImageAlpha() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Launcher icon with alpha",
        alpha = 0.5f)
}

//@Preview
@Composable
fun myImageScale() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Launcher icon with alpha",
        modifier = Modifier
            .height(10.dp)
            .width(30.dp),
        contentScale = ContentScale.Crop)
}

@Preview
@Composable
fun myImageRounded() {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Launcher icon with alpha",
        modifier = Modifier
            .clip(CircleShape)
            .border(
                BorderStroke(5.dp, Color.Blue),
                shape = CircleShape
            )
       )
}

@Preview
@Composable
fun myProfilePreview() {
    myProfile(image = R.drawable.ic_launcher_foreground)
}


@Composable
fun myProfile(image: Int) {
    Image(painter = painterResource(id = image),
        contentDescription = "Launcher icon with alpha",
        modifier = Modifier
            .clip(CircleShape)
            .border(
                BorderStroke(5.dp, Color.Blue),
                shape = CircleShape
            )
    )
}