package com.elmorshdi.weather.presentation

import com.elmorshdi.weather.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,

    val isLoading: Boolean = false,
    val error: String? = null
){

}
