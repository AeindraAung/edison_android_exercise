package jp.speakbuddy.edisonandroidexercise.ui.fact

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import jp.speakbuddy.edisonandroidexercise.domain.FactRepository
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class FactViewModel @Inject constructor(
    private val repository: FactRepository
) : ViewModel() {

    val lengthFlow: Flow<String> = repository.getLength().distinctUntilChanged()

    fun updateLength(completion: () -> Unit) {
        runBlocking {
            try {
                repository.loadLength()
            } catch (e: Throwable) {
                "something went wrong. error = ${e.message}"
            }.also { completion() }
        }
    }
}
