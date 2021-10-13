package com.assignments.string;

import java.util.Locale;

public class Main2 {

    public static int countYZ(String string) {
        int count = 0;
        String str = string.toLowerCase(Locale.ROOT);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                if ((i < str.length() - 1 && str.charAt(i+1)==' ') || i == str.length() - 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        System.out.println(countYZ("abc day"));


    }
}
