package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MytextField() {
    var textValue = "Initial Value"
    TextField(value = textValue, onValueChange = {
        textValue = it
    })
}

@Preview(showBackground = true)
@Composable
fun MytextFieldWithIcons() {
    var textValue = "Search"
    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon" ) },
        trailingIcon = { Icon(imageVector = Icons.Default.Close, contentDescription = "Close Icon") }
    )
}

@Preview(showBackground = true)
@Composable
fun MytextFieldWithPlaceHolder() {
    var textValue = ""
    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        placeholder = { Text(text = "Introduce un texto") }
    )
}

@Preview(showBackground = true)
@Composable
fun MytextFieldWithLabel() {
    var textValue = "Search"
    TextField(value = textValue, onValueChange = { textValue = it },
        label = { Text(text = "Introduce un texto") }
    )
}