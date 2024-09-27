package com.sahilpvns.javaprogram;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        for (int i = num; i > 0; i = i / 10) {
            rev = rev * 10 + i % 10;
        }
        System.out.println(rev);
    }
}
