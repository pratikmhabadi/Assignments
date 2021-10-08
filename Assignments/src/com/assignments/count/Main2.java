package com.assignments.count;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase(Locale.ROOT);

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> mapmap : map.entrySet()) {
            System.out.println(mapmap.getKey() + "=" + mapmap.getValue());
        }
    }
}
