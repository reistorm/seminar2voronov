package org.example.seminar5;
// Посчитать количество вхождений каждой буквы в тексте

import java.util.HashMap;
import java.util.Map;

public class FirstTaskAlternative {
    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();
        String str = "qwe askjdfj kaeja qwaeha";
        for (int i = 0; i < str.length(); i++) {
            map.putIfAbsent(str.charAt(i), 0); // проверяет был ключ или нет
            map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("буква - " + entry.getKey() + " , встретилась : " + entry.getValue());
        }
    }
}

