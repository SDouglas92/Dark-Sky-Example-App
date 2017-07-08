package com.example.simondouglas.darkskyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import static android.text.TextUtils.concat;

/**
 * Created by simondouglas on 08/07/2017.
 */

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        WeatherData weatherData = (WeatherData) intent.getSerializableExtra("WeatherData");
        createView(weatherData);
    }

    private void createView(WeatherData weatherData) {
        TextView timeView = (TextView) findViewById(R.id.detailsTimeView);
        TextView summaryView = (TextView) findViewById(R.id.deatilsSummaryView);
        TextView temperatureView = (TextView) findViewById(R.id.deatilsTemperatureView);
        TextView precipitationView = (TextView) findViewById(R.id.detailsPrecipitationView);
        TextView feelsLikeView = (TextView) findViewById(R.id.detailsFeelsLikeView);
        TextView windSpeedView = (TextView) findViewById(R.id.detailsWindSpeedView);
        TextView windBearingView = (TextView) findViewById(R.id.detailsWindBearingView);

        Date date = new Date(Long.parseLong(weatherData.getTime()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm");

        timeView.setText(dateFormat.format(date));
        summaryView.setText(weatherData.getSummary());
        temperatureView.setText(concat(weatherData.getTemperature(), "C"));
        feelsLikeView.setText(concat(weatherData.getFeelLikeTemperature(), "C"));
        windSpeedView.setText(concat(weatherData.getWindSpeed(), "mph"));
        windBearingView.setText(weatherData.getWindBearing());

        if (weatherData.getPrecipitationType() == null) {
            precipitationView.setVisibility(View.GONE);
        } else {
            Double precipProb = Double.parseDouble(weatherData.getPrecipitationProbability());
            Double precentage = precipProb * 100;

            precipitationView.setText(concat(precentage.toString(), "% of ", weatherData.getPrecipitationType()));
        }

    }

}
