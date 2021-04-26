package fr.maximedubost.coronavirusapi.network

import fr.maximedubost.coronavirusapi.models.RecyclerList
import fr.maximedubost.coronavirusapi.models.Region
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET("latest")
    suspend fun getRegions(): RecyclerList

    @GET("region")
    suspend fun getRegion(@Query("region") region: String): Region
}