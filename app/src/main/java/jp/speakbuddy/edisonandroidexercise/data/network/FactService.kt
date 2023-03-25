package jp.speakbuddy.edisonandroidexercise.data.network

import jp.speakbuddy.edisonandroidexercise.data.network.response.FactResponse
import retrofit2.http.GET

interface FactService {
    @GET("fact")
    suspend fun getFact(): FactResponse
}
