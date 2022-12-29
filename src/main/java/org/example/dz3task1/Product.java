package org.example.dz3task1;
// Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
// название которых содержит «высший».

public class Product {
    private String name;
    private Double price;
    private String grade;

    public Product(String name, Double price, String grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
