package com.aiglesiaspubill.androidsuperpoderes.ui.herolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import com.aiglesiaspubill.androidsuperpoderes.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HeroListViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    private val _heros = MutableStateFlow(emptyList<Hero>())
    val heros: StateFlow<List<Hero>> get() = _heros

    init {
        getHeros()
    }

    private fun getHeros() {
        viewModelScope.launch {
            repository.getHeros().flowOn(Dispatchers.IO).collect {
                _heros.value = it
            }
        }
    }
}