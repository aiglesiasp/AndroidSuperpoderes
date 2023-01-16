package com.aiglesiaspubill.androidsuperpoderes.data.remote

import com.aiglesiaspubill.androidsuperpoderes.BuildConfig
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val api: DragonBallApi) : RemoteDataSource {
    //OBTENER TOKEN
    override suspend fun getToken(): Result<String> {
        return runCatching { api.getToken() }
    }
}