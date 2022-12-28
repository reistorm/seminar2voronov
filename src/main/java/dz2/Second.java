package dz2;
// Дана последовательность целых чисел,
// оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int a, b, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 1; i <n ; i++) {
            b = scanner.nextInt();
            if (a % 10 == 0 && b < 0) {
                sum += a;
            }
            a = b;
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
