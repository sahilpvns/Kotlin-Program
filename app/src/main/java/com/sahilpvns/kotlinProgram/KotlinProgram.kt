package com.sahilpvns.kotlinProgram

/*
Input: S = “geeksforgeeks”
Output:
{g=2, e=4, k=2, s=2, f=1, o=1, r=1}

*/

fun main() {
    val str = "geeksforgeeks"
    val stringMapValue = mutableMapOf<Char , Int>()

    for(char in str){
        stringMapValue[char] = stringMapValue.getOrDefault(char, 0) + 1
    }

    println(stringMapValue)

}
