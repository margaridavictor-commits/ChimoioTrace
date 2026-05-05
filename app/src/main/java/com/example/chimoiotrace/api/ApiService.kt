package com.example.chimoiotrace.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

data class WeatherResponse(
    val main: Main,
    val weather: List<Weather>
)

data class Main(val temp: Double)
data class Weather(val description: String)

data class PriceResponse(val price: Double)

interface WeatherApiService {
    @GET("weather")
    fun getWeather(@Query("q") city: String, @Query("appid") apiKey: String): Call<WeatherResponse>
}

interface PriceApiService {
    @GET("price")
    fun getPrice(@Query("crop") crop: String): Call<PriceResponse>
}