package org.example.dz3task3.Book;
// Сведения о книге состоят из названия, фамилии автора,
// цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц,
// фамилия автора содержит «А» и год издания не позднее 2010 г.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Jane Eyre", "Charlotte Bronte", 50.0, 1847, 576);
        Book book2 = new Book("Morning magic", "Hal Elrod", 140.0, 2012, 240);
        Book book3 = new Book("The little Prince", "Antoine de Saint-Exupery", 200.0, 2010, 97);
        Book book4 = new Book("Fairytale Book", "Vladimir Syteev", 140.0, 2014, 16);
        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);
        String firstLetter = "A";
        Set<String> setNumberPages = new HashSet<>();
        Set<String> setSurname = new HashSet<>();
        Set<String> setName = new HashSet<>();
        Set<String> setYearPublishing = new HashSet<>();
        for (int i = 0; i < listBook.size(); i++) {
            if ((listBook.get(i).getYearPublishing()) >= 2010 && (listBook.get(i).getSurname().startsWith("A"))) {
                setYearPublishing.add(listBook.get(i).getName());
                setSurname.add(listBook.get(i).getName());
            }
            if (listBook.get(i).getNumberPages() >= 2) {
                for (int j=2; j<600; j++) {
                     if (listBook.get(i).getNumberPages() % j == 0) {
                         setNumberPages.add(listBook.get(i).getName());
                    }
                }
            }
        }
        System.out.println(setYearPublishing);

    }
}
