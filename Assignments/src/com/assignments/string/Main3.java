package com.assignments.string;

public class Main3 {
    public static int sumNumbers(String string) {
        int sum = 0;
        String temp = "";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                if ((i < string.length() - 1) && (Character.isDigit(string.charAt(i + 1)))) {
                    temp += string.charAt(i);
                } else {
                    temp += string.charAt(i);
                    sum += Integer.parseInt(temp.trim());
                    temp = "";
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("abc1xx2yy3xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));

    }
}
