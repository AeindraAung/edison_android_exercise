package jp.speakbuddy.edisonandroidexercise.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import jp.speakbuddy.edisonandroidexercise.data.network.FactService
import jp.speakbuddy.edisonandroidexercise.data.network.RetrofitFactory
import jp.speakbuddy.edisonandroidexercise.data.utils.PreferenceHelper
import jp.speakbuddy.edisonandroidexercise.utils.Constants
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return RetrofitFactory.createRetrofit(
            retrofitBuilder = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
        )
    }

    @Provides
    @Singleton
    fun provideSharedPreference(
        @ApplicationContext context: Context
    ): PreferenceHelper {
        return PreferenceHelper(context)
    }

    @Singleton
    @Provides
    fun provideFactService(retrofit: Retrofit): FactService {
        return retrofit.create(FactService::class.java)
    }
}