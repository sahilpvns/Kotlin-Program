package com.sahilpvns.javaprogram;

//Reverse a String
public class ReverseString {
    public static void main(String[] args) {
        String str = "sahil";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
