package org.example.TemperatureConverter;

public class TemperatureConverter {
    protected double fahrenheitToCelsius(double fahrenheit) {
        /*
         * This method should convert a temperature from Fahrenheit to Celsius using the formula:
         * [ Celsius = (Fahrenheit - 32) \times \frac{5}{9} ]
         *
         * The method should accept a double parameter (temperature in Fahrenheit)
         * and return a double value (temperature in Celsius).
         * */

        return (fahrenheit - 32) * 5 / 9;
    }

    protected double celsiusToFahrenheit(double celsius) {
        /*
         * This method should convert a temperature from Celsius to Fahrenheit using the formula:
         *
         * [ Fahrenheit = (Celsius \times \frac{9}{5}) + 32 ]
         *
         * The method should accept a double parameter (temperature in Celsius)
         * and return a double value (temperature in Fahrenheit).
         * */

        return (celsius * 9 / 5) + 32;
    }

    protected double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }

    protected boolean isExtremeTemperature(double celsius) {
        /*
         * This method should check if the given Celsius temperature is considered "extreme."
         * A temperature is considered extreme if it is:
         * Below -40°C, or
         * Above 50°C.
         * The method should accept a double parameter (temperature in Celsius)
         * and return a boolean value (true for extreme temperatures and false otherwise).
         */

        return (celsius < -40 || celsius > 50);
    }


}

