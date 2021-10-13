package com.assignments.string;

public class Main1 {
    public static boolean sameStarChar(String string) {
        int index = string.indexOf("*");
        if (index < 1 || index > string.length() - 1) {
            StringBuilder string1 = new StringBuilder(string);
            string1.setCharAt(index, ' ');
            return sameStarChar(string1.toString().trim());
        } else {
            char ch1 = string.charAt(index - 1);
            if (string.indexOf(ch1) < 0) {
                StringBuilder string1 = new StringBuilder(string);
                string1.setCharAt(index, ' ');
                return sameStarChar(string1.toString().trim());
            } else {
                String s = ch1 + "*" + ch1;
                if (string.contains(s.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("1 " + sameStarChar("xy*yzz"));//true
        System.out.println("2 " + sameStarChar("xy*zzz"));//false
        System.out.println("3 " + sameStarChar("*xa*az"));//true
        System.out.println("4 " + sameStarChar("xa*az"));//true
        System.out.println("5 " + sameStarChar("xb*az"));//false
        System.out.println("6 " + sameStarChar("qwe*ert"));//true
        System.out.println("7 " + sameStarChar("xy*zzz"));//false
        System.out.println("8 " + sameStarChar("qwe*frt*"));//false

    }
}
