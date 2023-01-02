package org.example.seminar5;
// Посчитать количество вхождений каждой буквы в тексте

import java.util.HashMap;
import java.util.Map;

public class FirstTask {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        String str = "qwe askjdfj kaeja qwaeha";
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

//        for (var entry :map.entrySet()) { можно так
        for (Map.Entry<Character, Integer> entry : map.entrySet()) { // с прямым обозначением работает быстрее
            System.out.println("буква - " +entry.getKey()+" , встретилась : "+ entry.getValue());
        }
    }
}
