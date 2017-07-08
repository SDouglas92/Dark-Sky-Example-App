package com.example.simondouglas.darkskyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GenerateMockData mockData = new GenerateMockData();
        ArrayList<WeatherData> weatherDataList = mockData.generateData();

        WeatherDataAdapter weatherDataAdapter = new WeatherDataAdapter(this, weatherDataList);
        ListView weatherList = (ListView) findViewById(R.id.weatherListView);

        weatherList.setAdapter(weatherDataAdapter);
    }

    public void onListItemClick(View weatherItem) {
        WeatherData weatherData = (WeatherData) weatherItem.getTag();
        Intent intent = new Intent(this, DetailsActivity.class);

        intent.putExtra("WeatherData", weatherData);
        startActivity(intent);
    }
}
