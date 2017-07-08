package com.example.simondouglas.darkskyapp;

import java.util.HashMap;

/**
 * Created by simondouglas on 08/07/2017.
 */

class WeatherData {
    
    private String time;
    private String summary;
    
    public WeatherData(HashMap<String, String> data) {
        time = data.get("time");
        summary = data.get("summary");
    }

    public String getTime() {
        return time;
    }

    public String getSummary() {
        return summary;
    }
}
