package com.sahilpvns.kotlinProgram

/*
find duplicate kotlin
Input: S = “geeksforgeeks”
Output:
e, count = 4
g, count = 2
k, count = 2
s, count = 2

*/

fun main() {
    val S = "geeksforgeeks"
    val stringMapValue = mutableMapOf<Char , Int>()

    for(char in S){
        stringMapValue[char] = stringMapValue.getOrDefault(char, 0) + 1
    }

    println(stringMapValue)



}
