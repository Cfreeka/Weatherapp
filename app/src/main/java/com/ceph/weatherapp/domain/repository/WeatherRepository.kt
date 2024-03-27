package com.ceph.weatherapp.domain

import com.ceph.weatherapp.domain.util.Resource
import com.ceph.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}