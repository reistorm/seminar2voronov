package dz2;

import java.util.Arrays;
import java.util.Scanner;

// Дан массив целых чисел. Найти сумму элементов,
// у которых последняя и предпоследняя цифры равны.


// задачу поняла так: дан массив, в нем сравнить пары чисел. Найти сумму пар,
// у которых последняя и предпоследняя цифры равны, т.е. [523,423,100,200,625,324] sum = 946, sum = 300

public class Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];

        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            if ((mass[i] % 10 == mass[i + 1] % 10) && (mass[i] % 100 == mass[i + 1] % 100)) {
                sum += mass[i] + mass[i+1];
                System.out.println("sum = " + sum);
            }
        }
        // System.out.println("sum = " + sum); если нужна общая сумма элементов,
        // в таком случае int sum = 0; выводим из цикла и пишем после public static void
        scanner.close();
    }
}


