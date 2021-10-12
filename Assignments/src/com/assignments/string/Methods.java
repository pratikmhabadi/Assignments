package com.assignments.string;

public class Methods {
    public static void main(String[] args) {
        System.out.println("Demonstrating methods of String");
        System.out.println("---Example of String immutable :---");
        String s = "Hello";
        String w = "world";
        s.concat(w);//concat world after hello;
        System.out.println(s);//because string is immutable so it prints Hello
        String s1 = s.concat(w);
        System.out.println(s1);//when we assign new object
        System.out.println();

        System.out.println("----- METHOD 1: CharAt()-----");
        char ch = s.charAt(3);
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(4);
        System.out.println("Character at index 3:" + ch);
        System.out.println("Character at index 0:" + ch1);
        System.out.println("Character at index 4:" + ch2);
        System.out.println();

        System.out.println("----- METHOD 2: equal()/compareTo()-----");
        System.out.println(s.equals(w));//false
        System.out.println(s.equals(s));//true
        System.out.println();

        System.out.println("----- METHOD 3:endsWith() -----");
        System.out.println(s1.endsWith("t"));//false
        System.out.println(s1.endsWith("d"));//true
        System.out.println();

        System.out.println("----- METHOD 4:String.format() -----");
        String sf = String.format("%s%s", s, w);
        System.out.println(sf);
        System.out.println();

        System.out.println("----- METHOD 5:indexOf -----");
        //passing substring
        System.out.println(s.indexOf("ll"));
        System.out.println(s.indexOf("ello"));
        //passing substring with from index
        System.out.println(s.indexOf("ll",2));
        //passing char value
        System.out.println(s.indexOf("o"));
        System.out.println();


        System.out.println("----- METHOD 6:substring() -----");
        System.out.println("Original String: " + s1);
        System.out.println("Substring starting from index 2: " +s1.substring(2));//lloworld
        System.out.println("Substring starting from index 0 to 5: "+s1.substring(0,5)); //hello
        System.out.println();

        System.out.println("----- METHOD 7:split() -----");
        String []split=s1.split("w");
        for(String word : split){
            System.out.println(word);
        }
        System.out.println();

        System.out.println("----- METHOD 8:length() -----");
        System.out.println("Length of s :"+s.length());
        System.out.println("Length of w :"+w.length());
        System.out.println("Length of s1 :"+s1.length());
        System.out.println();

        System.out.println("----- METHOD 9:toCharArray -----");
        char [] c = s1.toCharArray();
       for(char ca : c){
           System.out.println(ca);
       }
        System.out.println();

        System.out.println("----- METHOD 10:replace() -----");
        System.out.println("Original String :"+s1);
        String rs = s1.replace("l","p");
        System.out.println("after replace"+rs);
        System.out.println();

    }
}
