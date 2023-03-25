package jp.speakbuddy.edisonandroidexercise.domain

import kotlinx.coroutines.flow.Flow

interface FactRepository {
    suspend fun loadLength()
    fun getLength(): Flow<String>
}