package com.aiglesiaspubill.androidsuperpoderes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aiglesiaspubill.androidsuperpoderes.ui.theme.AndroidSuperpoderesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidSuperpoderesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Preview
@Composable
fun Greeting(name: String = "Android") {
    Text(text = "Hello $name!")
}

@Composable
fun HomeScreen() {

}

//VER MOVIL
@Preview(name= "NEXUS 5", showSystemUi = true, device = Devices.NEXUS_5)
@Composable
fun DefaultPreviewNexus5() {
    AndroidSuperpoderesTheme {
        Greeting("Android")
    }
}

//VER TABLET
@Preview(name= "NEXUS 10", showSystemUi = true, device = Devices.NEXUS_10)
@Composable
fun DefaultPreviewNexus10() {
    AndroidSuperpoderesTheme {
        Greeting("Android")
    }
}