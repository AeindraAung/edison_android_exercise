package jp.speakbuddy.edisonandroidexercise.data.network.response

import kotlinx.serialization.Serializable

@Serializable
data class FactResponse(
    val fact: String,
    val length: Int
)