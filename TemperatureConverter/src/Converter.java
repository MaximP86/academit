/**
 * Created by 1 on 05.07.2016.
 */
public class Converter {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    public Converter(double celsius, double fahrenheit, double kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    public double getCelsiusToFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public double getCelsiusToKelvin() {
        return celsius + 273.15;
    }

    public double getFahrenheitToCelsius() {
        return (fahrenheit - 32) / 1.8;
    }

    public double getFahrenheitToKelvin() {
        return (fahrenheit - 32) / 1.8 + 273.15;
    }

    public double getKelvinToCelsius() {
        return kelvin - 273.15;
    }

    public double getKelvinToFahrenheit() {
        return ((kelvin - 273.15) * 1.8) + 32;
    }

}
