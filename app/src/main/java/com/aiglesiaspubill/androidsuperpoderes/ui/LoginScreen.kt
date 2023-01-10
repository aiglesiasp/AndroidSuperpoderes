package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglesiaspubill.androidsuperpoderes.R

@Preview(showSystemUi = true)
@Composable
fun myLogin() {
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        myIconLogin(image = R.drawable.ic_launcher_foreground, true)
        Spacer(modifier = Modifier.size(40.dp))
        MyEditText(placeHolder = "Introduce un usuario...")
        Spacer(modifier = Modifier.size(20.dp))
        MyEditText(placeHolder = "Introduce una contraseña...")
        Spacer(modifier = Modifier.size(40.dp))
        MyButtonLogin(enabled = true, text = "LOGIN")

    }
}


@Composable
fun MyEditText(placeHolder : String) {
    var textValue = ""
    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = { MyString(text = placeHolder)},
        modifier = Modifier.padding(10.dp),
    )
}

@Composable
fun MyButtonLogin(enabled: Boolean, text: String) {
    Button(
        onClick = {    },
        modifier = Modifier
            .height(50.dp)
            .width(100.dp) ,
        colors = ButtonDefaults
            .buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.Green,
                disabledBackgroundColor = Color.Blue,
                disabledContentColor = Color.Black),
        enabled = enabled,
        border = if(enabled) BorderStroke(5.dp, Color.Blue) else BorderStroke(5.dp, Color.Yellow)
    )
    {
        Text(text = "$text")
    }
}

@Composable
fun MyString(text: String) {
    Text(text = text)
}

@Composable
fun myImageLogin(image: Int) {
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

@Composable
fun myIconLogin(image: Int, logged: Boolean) {
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
