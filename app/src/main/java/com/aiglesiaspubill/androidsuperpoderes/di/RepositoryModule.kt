package com.aiglesiaspubill.androidsuperpoderes.di

import com.aiglesiaspubill.androidsuperpoderes.data.RepositoryImpl
import com.aiglesiaspubill.androidsuperpoderes.data.remote.RemoteDataSource
import com.aiglesiaspubill.androidsuperpoderes.data.remote.RemoteDataSourceImpl
import com.aiglesiaspubill.androidsuperpoderes.domain.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(repositoryImpl: RepositoryImpl): Repository

    //@Binds
    //abstract fun bindLocalDataSource(localDataSourceImpl: LocalDataSourceImpl): LocalDataSource

    @Binds
    abstract fun bindRemoteDataSource(remoteDataSourceImpl: RemoteDataSourceImpl): RemoteDataSource


}