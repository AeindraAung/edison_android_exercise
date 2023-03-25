package jp.speakbuddy.edisonandroidexercise.domain

import jp.speakbuddy.edisonandroidexercise.data.mapper.FactMapper
import jp.speakbuddy.edisonandroidexercise.data.network.FactService
import jp.speakbuddy.edisonandroidexercise.data.utils.PreferenceHelper
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FactRepositoryImpl @Inject constructor(
    private val service: FactService,
    private val prefs: PreferenceHelper,
    private val mapper: FactMapper
): FactRepository {
    override suspend fun loadLength() {
        service.getFact()
            .let { mapper.toDomain(it) }
            .also { data -> prefs.saveMyString(data.length) }
    }

    override fun getLength(): Flow<String> {
        return prefs.myStringFlow
    }
}