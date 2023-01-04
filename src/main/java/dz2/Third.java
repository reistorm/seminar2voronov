package dz2;
//Дана последовательность N целых чисел. Найти сумму простых чисел.
// исправила на сумму простых чисел
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int a, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            for (int k = 2; k <= a; k++) {
                if (a % k == 0) {
                    sum += a;
                }
            }
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
