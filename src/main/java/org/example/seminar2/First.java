package org.example.seminar2;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        // реализовать pow(x, n), который вычисляет х возвеленный в степень n
        double x;
        int n;
        double result;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        n = scanner.nextInt();
        scanner.close();
        result = x;
        for (int i = 1; i < n; i++) {
            result = result * x;
        }
        System.out.println("result = " + result);
    }
}