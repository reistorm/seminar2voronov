package dz4;

import java.util.LinkedList;
import java.util.Scanner;

// Вывести список на экран в перевернутом виде (без массивов)
//Пример:
// 1->2->3->4
public class FirstTask {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        LinkedList<Integer> reverseLinkedList = new LinkedList<>();
        while(!integerLinkedList.isEmpty()) {
            reverseLinkedList.addLast(integerLinkedList.remove(integerLinkedList.size()-1));
        }
        System.out.println(reverseLinkedList);
    }

}
