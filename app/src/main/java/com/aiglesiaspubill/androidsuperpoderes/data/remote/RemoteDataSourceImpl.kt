package com.aiglesiaspubill.androidsuperpoderes.data.remote

import android.util.Log
import okhttp3.Credentials
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val api: DragonBallApi) : RemoteDataSource {
    //OBTENER TOKEN
    override suspend fun login(email: String, password: String) {
        val result = api.login(Credentials.basic(email, password))
        Log.d("TOKEN", result)
    }
}