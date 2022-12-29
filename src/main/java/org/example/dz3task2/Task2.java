package org.example.dz3task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Сведения о товаре состоят из наименования,
// страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
public class Task2 {
    public static void main(String[] args) {
        Produce produce1 = new Produce("Консервы", "Russia", 20.0, 80.0, "1");
        Produce produce2 = new Produce("Макароны", "Italia", 10.0, 100.0, "2");
        Produce produce3 = new Produce("Кофе", "Ethiopia", 50.0, 200.0, "высший");
        Produce produce4 = new Produce("Яйца", "Россия", 50.0, 105.0, "высший");
        Produce produce5 = new Produce("Сахар", "USA", 40.0, 190.0, "высший");
        List<Produce> listProduce = new ArrayList<>();
        listProduce.add(produce1);
        listProduce.add(produce2);
        listProduce.add(produce3);
        listProduce.add(produce4);
        listProduce.add(produce5);
        String search = "высший";
        Double minPrice = 0.0;
        Set<String> setGrade = new HashSet<>();
        Set<Double> setPrice = new HashSet<>();

        for (int i = 0; i < listProduce.size(); i++) {
            if(listProduce.get(i).getGrade().equals(search)) {
                setGrade.add(listProduce.get(i).getName());
                minPrice = listProduce.get(i).getPrice();
                if(listProduce.get(i+1).getPrice() < minPrice) {
                    minPrice = listProduce.get(i+1).getPrice();
                    System.out.println(listProduce.get(i+1).getCountry());
                }
            }

        }






    }
}
