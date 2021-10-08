package com.assignments.count;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Input :");
        String str = sc.next().toLowerCase(Locale.ROOT);

        char[] string = str.toCharArray();
        int[] count = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            count[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    count[i]++;
                    string[j] = '0';
                }
            }
        }


        System.out.println("Your Output");
        for (int i = 0; i < count.length; i++) {
            if (string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + count[i]);
        }

    }
}
