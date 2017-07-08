package com.example.simondouglas.darkskyapp;

import java.util.HashMap;

/**
 * Created by simondouglas on 08/07/2017.
 */

class WeatherData {
    
    private String time;
    private String summary;
    private String icon;
    private String temperature;
    private String precipitation;
    
    public WeatherData(HashMap<String, String> data) {
        time = data.get("time");
        summary = data.get("summary");
        icon = data.get("icon");
        temperature = data.get("temperature");
        precipitation = data.get("precipitation");
    }

    public String getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }

    public String getIcon() {
        return icon;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getPrecipitation() {
        return precipitation;
    }
}
