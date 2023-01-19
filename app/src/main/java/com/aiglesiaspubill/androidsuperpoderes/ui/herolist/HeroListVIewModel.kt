package com.aiglesiaspubill.androidsuperpoderes.ui.herolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import com.aiglesiaspubill.androidsuperpoderes.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HeroListViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    private val _heros = MutableLiveData<List<Hero>>()
    val heros: LiveData<List<Hero>> get() = _heros

    init {
        getHeros()
    }

    private fun getHeros() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                repository.getHeros()
            }

            _heros.value = result
        }
    }
}