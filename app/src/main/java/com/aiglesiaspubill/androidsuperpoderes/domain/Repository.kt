package com.aiglesiaspubill.androidsuperpoderes.domain

interface Repository {
    suspend fun login(email:String, password: String): Boolean
    suspend fun getHeros(): List<Hero>
}