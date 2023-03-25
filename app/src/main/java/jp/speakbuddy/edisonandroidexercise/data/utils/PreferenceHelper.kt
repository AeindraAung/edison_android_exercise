package jp.speakbuddy.edisonandroidexercise.data.utils

import android.content.Context
import android.content.SharedPreferences
import jp.speakbuddy.edisonandroidexercise.BuildConfig
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PreferenceHelper(context: Context) {
    private val prefFileName = "${BuildConfig.APPLICATION_ID}.Pref"
    private val latestUpdatedLength = "latest_updated_length"

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE)

    private val _myStringFlow = MutableStateFlow(sharedPreferences.getString(latestUpdatedLength, "")?: "")
    val myStringFlow: Flow<String> = _myStringFlow.asStateFlow()

    fun saveMyString(myString: String) {
        sharedPreferences.edit().putString(latestUpdatedLength, myString).apply()
        _myStringFlow.value = myString
    }
}
