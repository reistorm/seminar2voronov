package dz2.Converter;

public class convertValue {
    public static void main(String[] args) {
        Converter converter = new Converter(24.0);
        System.out.println("Fahrenheit = " + converter.celsiusToFahrenheit());
        System.out.println("Kelvin = " + converter.celsiusToKelvin());
    }

}
