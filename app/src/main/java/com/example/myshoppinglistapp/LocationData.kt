package com.example.myshoppinglistapp

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeocodingResponse(
    val data: List<GeocodingResult>,
    val success: Boolean
)

data class GeocodingResult(
    val place: String,
    val latitude: Double,
    val longitude: Double
)
