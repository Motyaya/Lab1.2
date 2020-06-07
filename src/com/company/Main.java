package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s="TAATA";
        for (int i=0;i<args.length;i++){
             s = args[i];
        }
        System.out.println(isPalindrome(s));
    }
    public static String reverseString(String s){
        String g="";
        for (int i=s.length()-1;i>-1;i--){
            g=g+s.charAt(i);
        }
        return g;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }
}
