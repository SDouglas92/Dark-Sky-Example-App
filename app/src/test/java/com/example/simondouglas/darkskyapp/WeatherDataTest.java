package com.example.simondouglas.darkskyapp;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by simondouglas on 08/07/2017.
 */

public class WeatherDataTest {

    WeatherData weatherData;
    private HashMap<String, String> data1 = new HashMap<String, String>(){{
        put("time", "1499515200");
        put("summary", "Partly Cloudy");
        put("icon", "partly-cloudy-day");
        put("precipIntensity", "0");
        put("precipProbability", "0");
        put("temperature", "14.34");
        put("apparentTemperature", "14.34");
        put("dewPoint", "9.12");
        put("humidity", "0.71");
        put("windSpeed", "10.45");
        put("windGust", "12.37");
        put("windBearing", "328");
        put("cloudCover", "0.3");
        put("pressure", "1017.38");
        put("ozone", "340.42");
        put("uvIndex", "5");
    }};

    @Before
    public void before() {
        weatherData = new WeatherData(data1);
    }


    @Test
    public void canCreateWeatherDataClass() {
        assertNotNull(weatherData);
    }

    @Test
    public void canGetTime() {
        assertEquals(data1.get("time"), weatherData.getTime());
    }

    @Test
    public void canGetSummary() {
        assertEquals(data1.get("summary"), weatherData.getSummary());
    }

    @Test
    public void canGetIconType() {
        assertEquals(data1.get("icon"), weatherData.getIcon());
    }

    @Test
    public void canGetTemperature() {
        assertEquals(data1.get("temperature"), weatherData.getTemperature());
    }

    @Test
    public void canGetPrecipitation() {
        assertEquals(data1.get("precipitation"), weatherData.getPrecipitation());
    }
}
