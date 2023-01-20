package com.aiglesiaspubill.androidsuperpoderes.ui.herolist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.aiglesiaspubill.androidsuperpoderes.ui.components.MyLazyColumn2
import dagger.hilt.android.lifecycle.HiltViewModel

@Preview(showSystemUi = true)
@Composable
fun HeroListScreen(viewModel: HeroListViewModel = hiltViewModel()) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        val heros = viewModel.heros.collectAsState()
        MyLazyColumn2(heros.value)
    }


}