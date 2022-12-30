package org.example.seminar4;

import java.util.LinkedList;
import java.util.Scanner;

public class primer {
    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());

        }
// отличие peek от pop в том, что пик оставляет значение в списке, а поп удаляет из LinkedList
//        System.out.println("peek = " + integerLinkedList.peek());
//        System.out.println("list" + integerLinkedList);
//        System.out.println("pop = " + integerLinkedList.pop());
//        System.out.println("list" + integerLinkedList);
        // добавим в начало
        integerLinkedList.addFirst(3);
        System.out.println("add first list" + integerLinkedList);
        // добавить в конец
        integerLinkedList.addLast(7);
        System.out.println("add last list" + integerLinkedList);
        //замена элемента
        integerLinkedList.set(2, 6);
        System.out.println("set elem list" + integerLinkedList);
        // проверить на наличие в списке
        System.out.println("search elem list (true/false) = " + integerLinkedList.contains(6));
        // удаление элемента по индексу
        integerLinkedList.remove(1);
        System.out.println("remove elem in index list" + integerLinkedList);
        // удаление элемента по значению
        integerLinkedList.remove((Integer) 4);
        System.out.println("remove elem list" + integerLinkedList);
    }
}

