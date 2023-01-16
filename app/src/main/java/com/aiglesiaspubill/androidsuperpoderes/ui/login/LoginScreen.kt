package com.aiglesiaspubill.androidsuperpoderes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.AutofillType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglesiaspubill.androidsuperpoderes.R

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AppLogo()
        LoginForm()
    }
}

@Preview
@Composable
fun AppLogo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "App Icon",
            Modifier
                .clip(CircleShape)
                .border(BorderStroke(3.dp, Color.Black), shape = CircleShape)
                .background(Color.Green)
        )

        Text("Android Superpoderes", style = MaterialTheme.typography.h5, textAlign = TextAlign.Center)
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Preview(showBackground = true)
@Composable
fun LoginForm(extended: Boolean = true) {
    Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        var email by rememberSaveable() {
            mutableStateOf("")
        }

        var password by rememberSaveable() {
            mutableStateOf("")
        }


        FormField("Email", Icons.Default.Email)
        if (extended) {
            FormField("Password", Icons.Default.Lock, trailingIcon = Icons.Default.Visibility)
        }
        LoginButton()
    }
}

@Preview(showBackground = true)
@Composable
fun FormFieldPreview() {
    FormField(placeholder = "Password", leadingIcon = Icons.Default.Lock, trailingIcon = Icons.Default.VisibilityOff, true)
}

@Composable
fun FormField(placeholder: String, leadingIcon: ImageVector, trailingIcon: ImageVector? = null, isPassword: Boolean= false) {
    var textValue by rememberSaveable {
        mutableStateOf("")
    }

    TextField(
        value = textValue,
        onValueChange = {
            textValue = it
        },

        modifier = Modifier.fillMaxWidth(),
        leadingIcon = {
            Icon(imageVector = leadingIcon, contentDescription = leadingIcon.name)
        },
        trailingIcon = {
            trailingIcon?.let { Icon(imageVector = it, contentDescription = it.name) }
        },
        placeholder = {
            FormFieldPlaceHolder(placeholder)
        },
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None

    )
}

@Composable
fun FormFieldPlaceHolder(placeholder: String) {
    Text(text = placeholder)
}

@Preview
@Composable
fun LoginButton() {
    Button(onClick = { }, modifier = Modifier.padding(8.dp)) {
        Text(text = "Login")
    }
}

