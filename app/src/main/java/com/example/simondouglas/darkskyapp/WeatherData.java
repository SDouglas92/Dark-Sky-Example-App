package com.example.simondouglas.darkskyapp;

import java.util.HashMap;

/**
 * Created by simondouglas on 08/07/2017.
 */

class WeatherData {
    
    private String time;
    
    public WeatherData(HashMap<String, String> data) {
        time = data.get("time");
    }

    public String getTime() {
        return time;
    }
}
