package com.example.libimgur.api

import com.example.libimgur.apis.ImgurAPIv3
import junit.framework.TestCase.assertNotNull
import okhttp3.OkHttpClient
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


class ImgurAPIv3Test {

    private val client = OkHttpClient.Builder().addInterceptor {
        val request  = it.request().newBuilder().addHeader("Authorization","Client-ID 72052f4f0d88637").build()

    it.proceed(request)
    }.build()


    var retrofit = Retrofit.Builder().client(client).addConverterFactory(MoshiConverterFactory.create())
        .baseUrl("https://api.imgur.com/3/")
        .build()




//    var retrofit = Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create())
//        .baseUrl("http://api.weatherapi.com/v1/")
//        .build()
    var  api = retrofit.create(ImgurAPIv3::class.java)

    @Test
    fun getTagsWorking(){
        println("Test started")
        val response = api.getTags().execute()
        println("Test done")
        println(response.raw().toString())
        assertNotNull(response.body())
    }
}