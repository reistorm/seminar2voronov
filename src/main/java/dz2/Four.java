package dz2;
//Дана последовательность из N целых чисел.
// Верно ли, что последовательность является возрастающей.
// ввела счетчик для ситуации, в которой может быть false
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        int a, b, n, f = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        boolean result = false;
        for (int i = 1; i < n; i++) {
            b = scanner.nextInt();
            if (a < b) {
                result = true;
                a = b;
            } else {
                f++;
                result = false;
            }

        }
        scanner.close();
        if ((result == true) && (f < 1)) {
            System.out.println(result);
        } else {
            System.out.println("Последовательность не является возрастающей");
        }
    }
}


