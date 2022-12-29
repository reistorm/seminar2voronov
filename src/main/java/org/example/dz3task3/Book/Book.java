package org.example.dz3task3.Book;
// Сведения о книге состоят из названия, фамилии автора,
// цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц,
// фамилия автора содержит «А» и год издания не позднее 2010 г.
public class Book {
    private String name;
    private String surname;
    private Double price;
    private Integer yearPublishing;
    private Integer numberPages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(Integer yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public Integer getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(Integer numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", price=" + price +
                ", yearPublishing=" + yearPublishing +
                ", numberPages=" + numberPages +
                '}';
    }

    public Book(String name, String surname, Double price, Integer yearPublishing, Integer numberPages) {
        this.name = name;
        this.surname = surname;
        this.price = price;
        this.yearPublishing = yearPublishing;
        this.numberPages = numberPages;
    }
}
