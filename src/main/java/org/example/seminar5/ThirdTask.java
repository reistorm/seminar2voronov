package org.example.seminar5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Найти пересечение двух массивов.
// Пример [1,2,3,4]
//        [3,5,6,7]

public class ThirdTask {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 4, 55};
        int[] nums2 = new int[]{3, 5, 6, 55, 3, 7};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
                set.remove(nums2[i]); // чтобы не повторялись два повторения
            }
        }
        System.out.println(result);
    }
}
