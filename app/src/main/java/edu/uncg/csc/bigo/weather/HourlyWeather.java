package com.example.bigo.weatherapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @Auther: Steven Tran
 */

public class HourlyWeather extends CurrentWeather {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_weather);

    }
}