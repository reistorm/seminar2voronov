package org.example.seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Заменить некратные 3 элементы списка, суммой нечетных элементов
public class Second {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            if (n % 2 == 1) {
                sum += n;
            }
            integerLinkedList.add(n);
            n = scanner.nextInt(); // вводим новое число чтобы цикл не был бесконечен
        }
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if(integerLinkedList.get(i) % 3 != 0) {
                integerLinkedList.set(i, sum);
            }
        }
        System.out.println("list=" + integerLinkedList);
    }
}
