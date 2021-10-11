package com.assignments.string;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String :");
        String s = sc.next().toLowerCase(Locale.ROOT);
        Map<Character,Integer> map = new HashMap<>();
        List<Character> stringList = new ArrayList<>();

        for(char c: s.toCharArray()){
            if(!stringList.contains(c)){
                stringList.add(c);
            }else{
                if(map.get(c)!=null) {
                    map.put(c, map.get(c) +1);
                }else{
                    map.put(c,1);
                }
            }
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int actual = entry.getValue()+1;
            System.out.println("We can make a good string by removing "+entry.getValue()+" of the "+actual+ " "+entry.getKey());
        }

    }
}
