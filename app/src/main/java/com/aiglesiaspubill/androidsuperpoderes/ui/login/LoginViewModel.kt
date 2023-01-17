package com.aiglesiaspubill.androidsuperpoderes.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aiglesiaspubill.androidsuperpoderes.data.RepositoryImpl
import com.aiglesiaspubill.androidsuperpoderes.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: RepositoryImpl): ViewModel() {


    fun checkValid(text: String): Boolean {
        return text.isNotBlank()
    }

    fun login(email: String, password: String) {
        Log.d("LoginViewModel", "Login with $email and $password")
        viewModelScope.launch {
            repository.login(email, password)
        }
    }
}