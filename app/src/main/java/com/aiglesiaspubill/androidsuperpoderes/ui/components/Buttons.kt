package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyButton2(enabled: Boolean, name: String) {
    Button(
        onClick = {    },
        modifier = Modifier.height(50.dp).width(100.dp) ,
        colors = ButtonDefaults
            .buttonColors(
                backgroundColor = Color.Black,
                contentColor = Color.Green,
                disabledBackgroundColor = Color.Blue,
                disabledContentColor = Color.Black),
        enabled = enabled,
        border = if(enabled)BorderStroke(5.dp, Color.Blue) else BorderStroke(5.dp, Color.Yellow)
    )
    {
        Text(text = "Click me $name")
    }
}

@Preview(name="Custom button with disable state")
@Composable
private fun MyButtonCustomEnabledPreview() {
    MyButton2(true, "ENABLED")
}

@Preview
@Composable
private fun MyButtonCustomDisabledPreview() {
    MyButton2(false, "DISABLED")
}