package dz2;
// Дан массив целых чисел. Заменить отрицательные элементы
// на сумму индексов двузначных элементов массива.

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < n; i++) {
            mass[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {

            if ((mass[i] < 100) && (mass[i] > 9) || ((mass[i] > -100) && (mass[i] < -9))) {
                sum += i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (mass[i] < 0) {
                mass[i] = sum;
            }
            System.out.println(mass[i]);
        }
        scanner.close();
    }
}
