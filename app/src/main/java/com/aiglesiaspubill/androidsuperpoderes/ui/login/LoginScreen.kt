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
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.aiglesiaspubill.androidsuperpoderes.ui.login.LoginViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Preview(showSystemUi = true)
@Composable
fun LoginScreen(viewModel: LoginViewModel = hiltViewModel(), onNavigateToList: () -> (Unit) = {}) {

    val success = viewModel.loginSucces.observeAsState(false)

    LaunchedEffect(key1 = success.value) {
        if(success.value) {
            onNavigateToList()
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AppLogo()
        LoginForm(viewModel = viewModel)
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

@Composable
fun LoginForm(extended: Boolean = true, viewModel: LoginViewModel) {
    Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        var email by rememberSaveable {
            mutableStateOf("")
        }
        var password by rememberSaveable {
            mutableStateOf("")
        }

        FormField(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email")

        if (extended) {
            FormField(
                value = password,
                onValueChange = { password = it },
                placeholder = "Password")
        }
        LoginButton {
            viewModel.login(email, password)
        }
    }
}

@Composable
fun LoginButton(onClick: () -> Unit) {
    Button(onClick = onClick, modifier = Modifier.padding(8.dp)) {
        Text(text = "Login")
    }
}

@Composable
fun FormField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    isPassword: Boolean = false,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
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

@Preview(showBackground = true)
@Composable
fun FormFieldPreview() {
    FormField(
        "Email",
        {},
        placeholder = "Password",
        true,
    )
}





