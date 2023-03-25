package jp.speakbuddy.edisonandroidexercise.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import jp.speakbuddy.edisonandroidexercise.domain.FactRepository
import jp.speakbuddy.edisonandroidexercise.domain.FactRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FactModule {
    @Binds
    @Singleton
    abstract fun bindRepository(impl: FactRepositoryImpl): FactRepository
}