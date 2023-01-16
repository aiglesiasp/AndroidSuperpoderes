package com.aiglesiaspubill.androidsuperpoderes.ui.herolist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aiglesiaspubill.androidsuperpoderes.ui.components.MyLazyColumn2

@Preview(showSystemUi = true)
@Composable
fun HeroListScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        MyLazyColumn2()
    }
}