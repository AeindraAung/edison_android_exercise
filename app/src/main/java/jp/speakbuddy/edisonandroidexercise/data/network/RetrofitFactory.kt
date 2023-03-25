package jp.speakbuddy.edisonandroidexercise.data.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

object RetrofitFactory {
    fun createRetrofit(
        retrofitBuilder: Retrofit.Builder
    ): Retrofit = retrofitBuilder
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .build()
}