package dz6;

// Задание:
//• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
//• Создать множество ноутбуков.
//• Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например:
//“Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//• Далее нужно запросить минимальные значения для указанных критериев -
// сохранить параметры фильтрации можно также в Map.
//• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Laptops {
    private Integer ram;
    private Integer hdd;
    private String os;
    private String colour;
    private String material;

    public Laptops(Integer ram, Integer hdd, String os, String colour, String material) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
        this.material = material;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
