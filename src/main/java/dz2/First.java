package dz2;


// Дана последовательность N целых чисел. Найти количество
// положительных чисел, после которых следует отрицательное число.
// инкремент написала верно

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int a, b, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                sum++;
            }
            a = b;
        }
        System.out.println("sum = " + sum);
        scanner.close();

    }
}
