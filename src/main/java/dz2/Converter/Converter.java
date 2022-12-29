package dz2.Converter;
//Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты. У классов наследников необходимо переопределить
// метод интерфейса, для валидного перевода величин.
// Метод для конвертации назовите "convertValue".

public class Converter {
    private Double celsius;

    public Converter(Double celsius) {
        this.celsius = celsius;
    }

    public Double getCelsius() {
        return celsius;
    }

    @Override
    public String toString() {
        return "Converter{" +
                "Celsius=" + celsius +
                '}';
    }
    public void setCelsius(Double celsius) {
        celsius = celsius;
    }
    public double celsiusToFahrenheit() {
        return celsius * 1.8 + 32;
    }
    public double celsiusToKelvin() {
        return celsius + 273.15;
    }
}


