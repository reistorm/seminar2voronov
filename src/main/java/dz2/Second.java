package dz2;
// Дана последовательность целых чисел,
// оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.
// исправила на цикл while
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int a, b, sum = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        while (a != 0) {
            b = scanner.nextInt();
            if (b < 0) {
                sum += a;
            }
            a = b;
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
