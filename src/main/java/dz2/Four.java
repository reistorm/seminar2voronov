package dz2;
//Дана последовательность из N целых чисел.
// Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

//Дана последовательность из N целых чисел.
//Верно ли, что последовательность является возрастающей.
public class Four {
    public static void main(String[] args) {
        int a, b, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        boolean result = false;
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a < b) {
                result = true;
                a = b;
            }
            else {
                result = false;
            }

        }
        scanner.close();
        System.out.println(result);
    }

}
