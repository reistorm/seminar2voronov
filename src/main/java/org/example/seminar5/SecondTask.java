package org.example.seminar5;
// Определить, есть ли в массиве дубликаты. Если найден хоть один, вывести на экран true

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        Set<Integer> set = new HashSet<>();
        boolean f = true;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                f = false;
                break;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(f);
    }
}

// 2 вариант через сравнение длин массива
//public class SecondTask {
//    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4,5,6};
//        Set<Integer> set = new HashSet<>();
//        boolean f= true;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr.length != set.size()) {
//                System.out.println("false");
//            }
//            else {
//                System.out.println("true");
//            }
//        }
//        System.out.println(f);
//    }
//}

// 3 вариант
//public class SecondTask {
//    public static void main(String[] args) {
//        List<Integer> arr2 = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            arr2.add(i); // 0 1 2 3
//            arr2.add(i); // добавятся копии 0 1 2 3 0 1 2 3
//        }
//        Set<Integer> set = new HashSet<>();
//        if(arr2.size() != set.size()) {
//            System.out.println("false");
//        }
//        else {
//            System.out.println("true");
//        }
//    }
//}
