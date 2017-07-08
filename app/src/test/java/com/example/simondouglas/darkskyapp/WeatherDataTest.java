package com.example.simondouglas.darkskyapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by simondouglas on 08/07/2017.
 */

public class WeatherDataTest {

    @Test
    public void canCreateWeatherDataClass() {
        assertNotNull(new WeatherData());
    }
}
