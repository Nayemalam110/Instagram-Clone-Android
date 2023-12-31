package com.example.libimgur.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WeatherTest(
    @Json(name = "current")
    val current: Current?,
    @Json(name = "location")
    val location: Location?
) {
    @JsonClass(generateAdapter = true)
    data class Current(
        @Json(name = "cloud")
        val cloud: Int?,
        @Json(name = "condition")
        val condition: Condition?,
        @Json(name = "feelslike_c")
        val feelslikeC: Double?,
        @Json(name = "feelslike_f")
        val feelslikeF: Double?,
        @Json(name = "gust_kph")
        val gustKph: Double?,
        @Json(name = "gust_mph")
        val gustMph: Double?,
        @Json(name = "humidity")
        val humidity: Int?,
        @Json(name = "is_day")
        val isDay: Int?,
        @Json(name = "last_updated")
        val lastUpdated: String?,
        @Json(name = "last_updated_epoch")
        val lastUpdatedEpoch: Int?,
        @Json(name = "precip_in")
        val precipIn: Double?,
        @Json(name = "precip_mm")
        val precipMm: Double?,
        @Json(name = "pressure_in")
        val pressureIn: Double?,
        @Json(name = "pressure_mb")
        val pressureMb: Double?,
        @Json(name = "temp_c")
        val tempC: Double?,
        @Json(name = "temp_f")
        val tempF: Double?,
        @Json(name = "uv")
        val uv: Double?,
        @Json(name = "vis_km")
        val visKm: Double?,
        @Json(name = "vis_miles")
        val visMiles: Double?,
        @Json(name = "wind_degree")
        val windDegree: Int?,
        @Json(name = "wind_dir")
        val windDir: String?,
        @Json(name = "wind_kph")
        val windKph: Double?,
        @Json(name = "wind_mph")
        val windMph: Double?
    ) {
        @JsonClass(generateAdapter = true)
        data class Condition(
            @Json(name = "code")
            val code: Int?,
            @Json(name = "icon")
            val icon: String?,
            @Json(name = "text")
            val text: String?
        )
    }

    @JsonClass(generateAdapter = true)
    data class Location(
        @Json(name = "country")
        val country: String?,
        @Json(name = "lat")
        val lat: Double?,
        @Json(name = "localtime")
        val localtime: String?,
        @Json(name = "localtime_epoch")
        val localtimeEpoch: Int?,
        @Json(name = "lon")
        val lon: Double?,
        @Json(name = "name")
        val name: String?,
        @Json(name = "region")
        val region: String?,
        @Json(name = "tz_id")
        val tzId: String?
    )
}