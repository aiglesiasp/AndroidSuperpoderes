package com.aiglesiaspubill.androidsuperpoderes.ui

sealed class Screens(val route: String) {
    object Login: Screens ("login")
    object HeroList: Screens ("heroList")
}