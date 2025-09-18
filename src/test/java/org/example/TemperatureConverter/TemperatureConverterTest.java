package org.example.TemperatureConverter;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testConvertFahrenheitToCelsius() {
        assertEquals(25.0, converter.fahrenheitToCelsius(77.0), 0.1);
        assertEquals(28.0, converter.fahrenheitToCelsius(82.4), 0.1);
        assertEquals(-35.6, converter.fahrenheitToCelsius(-32.0), 0.1);
        assertEquals(-17.8, converter.fahrenheitToCelsius(0.0), 0.1);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), 0.1);
        assertEquals(77.0, converter.celsiusToFahrenheit(25.0), 0.1);
        assertEquals(212.0, converter.celsiusToFahrenheit(100.0), 0.1);
        assertEquals(53.6, converter.celsiusToFahrenheit(12.0), 0.1);
    }

    @Test
    public void testConvertCelsiusToCelsius() {
        assertEquals(true, converter.isExtremeTemperature(100));
        assertEquals(true, converter.isExtremeTemperature(-50));
        assertEquals(false, converter.isExtremeTemperature(28));
    }

    @Test
    public void testConvertKelvinToCelsius() {
        assertEquals(26.8, converter.kelvinToCelsius(300.0), 0.1);
        assertEquals(-273.15, converter.kelvinToCelsius(0.0), 0.1);
        assertEquals(726.8, converter.kelvinToCelsius(1000.0), 0.1);
    }
}