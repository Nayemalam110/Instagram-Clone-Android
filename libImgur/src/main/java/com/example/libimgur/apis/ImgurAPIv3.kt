package com.example.libimgur.apis

import com.example.libimgur.models.GalleryResponse
import com.example.libimgur.models.TagResponse
import com.example.libimgur.models.WeatherTest
import retrofit2.Call
import retrofit2.http.GET

interface ImgurAPIv3 {
    @GET("gallery/hot?album_previews=true")
    fun getGallery() : Call<GalleryResponse>
    @GET("tags")
    fun getTags() : Call<TagResponse>
    @GET("current.json?key=51412a06e90b48458a270248231602&q=London&aqi=no")
    fun getWeather() : Call<WeatherTest>
}