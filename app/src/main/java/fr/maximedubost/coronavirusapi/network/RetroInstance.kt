package fr.maximedubost.coronavirusapi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {
    companion object {
        private const val baseUrl = "https://api.quarantine.country/api/v1/summary/"
        fun getRetroInstance(): Retrofit = Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}