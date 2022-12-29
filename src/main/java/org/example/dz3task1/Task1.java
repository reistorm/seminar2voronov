package org.example.dz3task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Product product1 = new Product("Мука", 50.0, "1");
        Product product2 = new Product("Кофе", 40.5, "2");
        Product product3 = new Product("Масло", 80.0, "3");
        Product product4 = new Product("Какао", 100.0, "высший");
        Product product5 = new Product("Яйца", 600.0, "высший");
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        String search = "высший";
        Double maxPriceProduct = 0.0;
        Set<String> setGrade = new HashSet<>();
        Double maxPrice = 0.0;
        Double minPrice = 0.0;
        for (int i = 0; i < listProduct.size(); i++) {

            if (listProduct.get(i).getGrade().equals(search)) {
                setGrade.add(listProduct.get(i).getName());
                maxPrice = listProduct.get(i).getPrice();

                if (listProduct.get(i + 1).getPrice() > maxPrice) {
                    maxPrice = listProduct.get(i + 1).getPrice();


                }
                maxPriceProduct += maxPriceProduct + maxPrice;
                System.out.println("Товары = " + setGrade);
                System.out.println("maxPriceProduct = " + maxPriceProduct);
            }


        }


    }


//setGrade.add(listProduct.get(i+1).getGrade());
//                maxPriceProduct += listProduct.get(i+1).getPrice();
//                System.out.println(setGrade);
//                System.out.println(maxPriceProduct);
}


//            if (listProduct.get(i).getGrade().equals(search)) {
//                setGrade.add(listProduct.get(i).getGrade());
////                maxPriceProduct += listProduct.get(i).getPrice();
//                for (int j = 0; j < listProduct.size()-1; j++) {
//                    maxPrice = listProduct.get(j).getPrice();
//                    if (listProduct.get(j + 1).getPrice() > maxPrice) {
//                        maxPriceProduct += listProduct.get(j + 1).getPrice();
//                        System.out.println("maxPriceProduct = " + maxPriceProduct);