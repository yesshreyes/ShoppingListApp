package com.example.myshoppinglistapp

import retrofit2.http.GET
import retrofit2.http.Query

interface GeocodingApiService {

    @GET("/api/v1/location/address")
    suspend fun getAddressFromCoordinates(
        @Query("latlng") latlng: String,
        @Query("key") apiKey: String
    ): GeocodingResponse
}
