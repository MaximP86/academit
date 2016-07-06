/**
 * Created by 1 on 05.07.2016.
 */
public class Converter {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public double getCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public double getCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double getFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public double getFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) / 1.8 + 273.15;
    }

    public double getKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double getKelvinToFahrenheit(double kelvin) {
        return ((kelvin - 273.15) * 1.8) + 32;
    }

}
