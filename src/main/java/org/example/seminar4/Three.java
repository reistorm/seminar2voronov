package org.example.seminar4;

import java.util.LinkedList;
import java.util.Scanner;

// Построить однонаправленный список целых чисел.
// Удалить отрицательные элементы списка.
public class Three {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n != 0) {
            integerLinkedList.add(n);
            n = scanner.nextInt();
        }
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if(integerLinkedList.get(i) < 0) {
                integerLinkedList.remove(i);
                i--;
            }
        }
        System.out.println("list =" + integerLinkedList);
    }
}
