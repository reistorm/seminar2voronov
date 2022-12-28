package dz2;
//Дана последовательность из N целых чисел.
// Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

//Дана последовательность из N целых чисел.
//Верно ли, что последовательность является возрастающей.
public class Four {
    public static boolean main(String[] args) {
        int a, b, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (a > b)
                return false;
            a = b;
        }
        return true;
    }
}
