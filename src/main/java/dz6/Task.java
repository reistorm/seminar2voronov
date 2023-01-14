package dz6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Laptops laptops1 = new Laptops(2, 100, "Windows", "blue", "plastic");
        Laptops laptops2 = new Laptops(4, 100, "Mac", "white", "aluminum");
        Laptops laptops3 = new Laptops(8, 500, "Linux", "black", "aluminum");
        Laptops laptops4 = new Laptops(4, 500, "Windows", "black", "plastic");
        List<Laptops> listLaptops = new ArrayList<>();
        listLaptops.add(laptops1);
        listLaptops.add(laptops2);
        listLaptops.add(laptops3);
        listLaptops.add(laptops4);

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Введите необходимые параметры: ");
        System.out.println("RAM = ");
        int ram = inputNumber.nextInt();
        System.out.println("HDD = ");
        int hdd = inputNumber.nextInt();
        System.out.println("OS = ");
        String os = inputNumber.next();
        System.out.println("Colour = ");
        String colour = inputNumber.next();
        System.out.println("Material = ");
        String material = inputNumber.next();
        inputNumber.close();

        List<Laptops> outputLaptops = new ArrayList<>();

        for (int i = 0; i < listLaptops.size(); i++) {
            Laptops laptops = listLaptops.get(i);
            if((laptops.getRam() >= ram) | (laptops.getHdd() >= hdd)) {
                outputLaptops.add(laptops);
            }
            else if ((laptops.getOs().equals(os)) || (laptops.getColour().equals(colour) || (laptops.getMaterial().equals(material)))) {
                outputLaptops.add(laptops);
            }

        }
        for (int i = 0; i < outputLaptops.size(); i++) {
            Laptops laptops = outputLaptops.get(i);
            System.out.println(laptops.getRam() + " " + laptops.getHdd() + " " + laptops.getOs() + " " + laptops.getColour()
            + " " + laptops.getMaterial());

        }
    }
}
