package jp.speakbuddy.edisonandroidexercise.data.mapper

import jp.speakbuddy.edisonandroidexercise.data.network.response.FactResponse
import jp.speakbuddy.edisonandroidexercise.domain.model.Fact
import javax.inject.Inject

class FactMapper @Inject constructor() {
    fun toDomain(data: FactResponse): Fact {
        return Fact(
            length = data.length.toString()
        )
    }
}