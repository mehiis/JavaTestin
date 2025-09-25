import org.example.TemperatureConverter.TemperatureConverter;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        System.out.println(converter.fahrenheitToCelsius(77.0));
        System.out.println(converter.celsiusToFahrenheit(25.0));
        System.out.println(converter.kelvinToCelsius(300.0));
    }
}
