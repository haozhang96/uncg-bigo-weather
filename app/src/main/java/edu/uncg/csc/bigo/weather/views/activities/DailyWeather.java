package com.example.bigo.weatherapp.views.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.bigo.weatherapp.R;

/**
 * Author: Steven Tran
 */

public class DailyWeather extends CurrentWeather {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_weather);

    }
}
