package org.example.seminar3.seminar3task1;
// Даны сведения об экспортируемых товарах: указывается наименование
// товара, страна, экспортирующая товар и объем поставляемой партии
// в штуках. Найти страны, которые экспортируют данный товар, и общий
// объем его экспорта
public class Tovar {
    private String name;
    private String country;
    private Integer volume;

    public Tovar(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }
    public Tovar() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                '}';
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
