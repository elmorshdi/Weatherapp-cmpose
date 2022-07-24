package com.elmorshdi.weather.data.repository

import com.elmorshdi.weather.data.mappers.toWeatherInfo
import com.elmorshdi.weather.data.remote.WeatherApi
import com.elmorshdi.weather.domain.repository.WeatherRepository
import com.elmorshdi.weather.domain.util.Resource
import com.elmorshdi.weather.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(lat, long).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An error occurred")
        }
    }
}