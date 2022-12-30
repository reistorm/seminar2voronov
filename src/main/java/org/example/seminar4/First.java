package org.example.seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Построить однонаправленный список целых чисел.
// Найти сумму четных элементов списка
public class First {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if (integerLinkedList.get(i) % 2 == 0) {
                sum += integerLinkedList.get(i);
            }
        }
        System.out.println("sum =" + sum);
    }
}
