package com.example.simondouglas.darkskyapp;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by simondouglas on 08/07/2017.
 */

class GenerateMockData {

    private HashMap<String, String> dataSet1 = new HashMap<String, String>() {{
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

    private HashMap<String, String> dataSet2 = new HashMap<String, String>() {{
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

    private HashMap<String, String> dataSet3 = new HashMap<String, String>() {{
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

    private HashMap<String, String> dataSet4 = new HashMap<String, String>() {{
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

    private HashMap<String, String> dataSet5 = new HashMap<String, String>() {{
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

    private HashMap<String, String> dataSet6 = new HashMap<String, String>() {{
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

    ArrayList<WeatherData> dataList;

    public GenerateMockData() {

        WeatherData data1 = new WeatherData(dataSet1);
        WeatherData data2 = new WeatherData(dataSet2);
        WeatherData data3 = new WeatherData(dataSet3);
        WeatherData data4 = new WeatherData(dataSet4);
        WeatherData data5 = new WeatherData(dataSet5);
        WeatherData data6 = new WeatherData(dataSet6);

        dataList = new ArrayList();
        dataList.add(data1);
        dataList.add(data2);
        dataList.add(data3);
        dataList.add(data4);
        dataList.add(data5);
        dataList.add(data6);
    }

    public ArrayList generateData() {
        return dataList;
    }
}
