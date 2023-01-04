package dz4;

import java.util.LinkedList;
import java.util.Scanner;

// Определить является ли список знакочередующимся? (без массивов)
public class SecondTask {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Boolean result = false;
        int f = 0;
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        scanner.close();
        int a = integerLinkedList.get(0);
        int b = integerLinkedList.get(1);
        int k = 2;
        while (k < (n - 1)) {
            if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
                a = integerLinkedList.get(k);
                b = integerLinkedList.get(k + 1);
                result = true;
                k += 1;
            } else {
                result = false;
                f += 1;
                break;
            }

        }
        if ((result == true) && (f < 0)) {
            System.out.println("Список является знакочередующимся");
        } else {
            System.out.println("Список не является знакочередующимся");
        }
    }
}

