package com.example.bigo.weatherapp;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @Auther: Steven Tran
 */

public class SettingsActivity extends CurrentWeatherActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

    }
}
