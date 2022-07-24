package com.elmorshdi.weather.domain.repository

import com.elmorshdi.weather.domain.util.Resource
import com.elmorshdi.weather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat:Double,long:Double):Resource<WeatherInfo>
}