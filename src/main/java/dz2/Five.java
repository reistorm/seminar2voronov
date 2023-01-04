package dz2;

import java.util.Arrays;
import java.util.Scanner;

// Дан массив целых чисел. Найти сумму элементов,
// у которых последняя и предпоследняя цифры равны.
public class Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
            if ((mass[i] % 10 == (mass[i] / 10) % 10)) {
                sum += mass[i];

            }
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}


