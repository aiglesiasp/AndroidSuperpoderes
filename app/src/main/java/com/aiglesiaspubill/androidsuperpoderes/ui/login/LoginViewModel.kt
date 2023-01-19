package com.aiglesiaspubill.androidsuperpoderes.ui.login

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aiglesiaspubill.androidsuperpoderes.data.RepositoryImpl

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Credentials
import java.nio.charset.StandardCharsets
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: RepositoryImpl, private val sharedPreferences: SharedPreferences): ViewModel() {

    private val _loginSuccess = MutableLiveData<Boolean>()
    val loginSucces: LiveData<Boolean> get() = _loginSuccess

    private fun setValueOnMainThread(value: Boolean) {
        viewModelScope.launch(Dispatchers.Main) {
            _loginSuccess.value = value
        }
    }

    fun checkValid(text: String): Boolean {
        return text.isNotBlank()
    }

    //OBTENER CREDENCIALES
    private fun getCredentials(user: String, pass: String): String {
        return Credentials.basic(user, pass, StandardCharsets.UTF_8)
    }

    fun login(email: String, password: String) {
        Log.d("LoginViewModel", "Login with $email and $password")

        //COMPRUEBO SI ESTA EN SHAREDPREFERENCES
        if(sharedPreferences.getString("TOKEN", null) == null) {
            sharedPreferences.edit().putString("CREDENTIAL", getCredentials(email,password)).apply()
        }

        viewModelScope.launch {
            val success = withContext(Dispatchers.IO) {
                repository.login(email, password)
            }

            setValueOnMainThread(success)
        }
    }
}