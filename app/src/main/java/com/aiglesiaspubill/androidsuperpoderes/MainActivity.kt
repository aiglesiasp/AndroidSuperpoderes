package com.aiglesiaspubill.androidsuperpoderes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.findNavController
import androidx.navigation.navArgument
import com.aiglesiaspubill.androidsuperpoderes.ui.Screens
import com.aiglesiaspubill.androidsuperpoderes.ui.components.*
import com.aiglesiaspubill.androidsuperpoderes.ui.herolist.HeroListScreen
import com.aiglesiaspubill.androidsuperpoderes.ui.theme.AndroidSuperpoderesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidSuperpoderesTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background)
                {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = Screens.Login.route) {
                        //PRIMER COMPOSABLE DE EL LOGIN
                        composable(Screens.Login.route) {
                            LoginScreen() {
                                navController.navigate(Screens.HeroList.route)
                            }
                        }
                        composable(Screens.HeroList.route) {
                            HeroListScreen()
                        }
                    }


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



