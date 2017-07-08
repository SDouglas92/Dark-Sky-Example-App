package com.example.simondouglas.darkskyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by simondouglas on 08/07/2017.
 */

class WeatherDataAdapter extends ArrayAdapter<WeatherData> {

    public WeatherDataAdapter(Context context, ArrayList<WeatherData> weatherDataList) {
        super(context, 0, weatherDataList);
    }

    @Override
    public View getView(int poisition, View weatherItemView, ViewGroup parent) {

        if(weatherItemView == null) {
            weatherItemView = LayoutInflater.from(getContext()).inflate(R.layout.weather_items, parent, false);
        }

        WeatherData currentData = getItem(poisition);

        TextView timeView = (TextView) weatherItemView.findViewById(R.id.timeView);
        ImageView weatherIconView = (ImageView) weatherItemView.findViewById(R.id.weatherIconView);
        TextView summaryView = (TextView) weatherItemView.findViewById(R.id.summaryView);
        TextView tempView = (TextView) weatherItemView.findViewById(R.id.temperatureView);

        Date date = new Date(Long.parseLong(currentData.getTime()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm");


        timeView.setText(dateFormat.format(date));
        summaryView.setText(currentData.getSummary());
        tempView.setText(currentData.getTemperature());

        weatherItemView.setTag(currentData);

        return weatherItemView;
    }

}
