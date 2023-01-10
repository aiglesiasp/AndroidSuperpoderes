package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
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

@Preview
@Composable
fun myIcon() {
    Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "Launcher icon")
}

//@Preview
@Composable
fun myIconRounded() {
    Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground),
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
fun myIconProfilePreview() {
    myIconProfile(image = R.drawable.ic_launcher_foreground, false)
}


@Composable
fun myIconProfile(image: Int, logged: Boolean) {
    Icon(painter = painterResource(id = image),
        contentDescription = "Launcher icon with alpha",
        modifier = Modifier
            .clip(CircleShape)
            .border(
                BorderStroke(5.dp, Color.Blue),
                shape = CircleShape
            ),
        tint = if (logged) Color.Green else Color.Red
    )
}


@Preview
@Composable
fun mySearchIcon() {
    Icon(imageVector = Icons.Default.Call,
        contentDescription = "Launcher icon with alpha",
        modifier = Modifier.size(50.dp)
    )
}