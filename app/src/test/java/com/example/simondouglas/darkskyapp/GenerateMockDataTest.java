package com.example.simondouglas.darkskyapp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by simondouglas on 08/07/2017.
 */

public class GenerateMockDataTest {

    GenerateMockData mockData;

    @Before
    public void before() {
        mockData = new GenerateMockData();
    }

    @Test
    public void canCreateGenerateMockDataClass() {
        assertNotNull(mockData);
    }

    @Test
    public void canGenerate6EntriesOfMockData() {
        assertEquals(6, mockData.generateData().size());
    }
}
