package dz5;

import java.util.HashMap;
import java.util.Map;

// Найти пересечения слов в массивах и указать их общее количество.
//Пример:
//mas1= [“qwe”,”asd”,”qwe”,”x”]
//mas2=[“qwe”,”v”]
//Результат:
//qwe=3
public class ThirdTask {
    public static void main(String[] args) {
        String[] mass1 = new String[]{"qwe", "asd", "qwe", "x"};
        String[] mass2 = new String[]{"qwe", "v"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < mass1.length; i++) {
            if (map.containsKey(mass1[i])) {
                map.put(mass1[i], map.get(mass1[i]) + 1);
            } else {
                map.put(mass1[i], 1);
            }
        }
        for (int k = 0; k < mass2.length; k++) {
            if (map.containsKey(mass2[k])) {
                map.put(mass2[k], map.get(mass2[k]) + 1);
            } else {
                map.put(mass2[k], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
