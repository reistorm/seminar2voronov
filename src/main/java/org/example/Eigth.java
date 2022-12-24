package org.example;

import java.util.Scanner;

public class Eigth {
    //Дана последовательность из n целых чисел. Найти сумму чисел, оканчивающихся на 5,
    // перед которыми идет четное число
    public static void main(String[] args) {
        int a, b, sum = 0, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt(); //предыдущее
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt(); // текущее
            if ((b % 10 == 5) && (a % 2 == 0)) {
                sum += b;
            }
            a = b;

        }
        System.out.println("sum = " + sum);
        scanner.close();
    }


}
