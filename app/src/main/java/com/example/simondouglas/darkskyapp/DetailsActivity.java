package com.example.simondouglas.darkskyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by simondouglas on 08/07/2017.
 */

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        WeatherData weatherData = (WeatherData) intent.getSerializableExtra("weatherData");
    }

}
