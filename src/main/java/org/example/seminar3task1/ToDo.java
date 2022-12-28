package org.example.seminar3task1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class ToDo {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("qwe1", "rt1", 5);
        Tovar tovar2 = new Tovar("qwe", "rt2",6);
        Tovar tovar3 = new Tovar("qwe1", "rt3", 7);
        List<Tovar> listTovar= new ArrayList<>();
        listTovar.add(tovar1);
        listTovar.add(tovar2);
        listTovar.add(tovar3);
        String search = "qwe1";
        Integer totalExportVolume = 0;
        Set<String> setCountry= new HashSet<>();
        for (int i = 0; i < listTovar.size(); i++) {
            if (listTovar.get(i).getName().equals(search)) {
                setCountry.add(listTovar.get(i).getCountry());
                totalExportVolume += listTovar.get(i).getVolume();
            }

        }
        System.out.println("setCountry = " + setCountry);
        System.out.println("totalExportVolume = " + totalExportVolume);
    }
}
