package com.sahilpvns.kotlinProgram.stringProgram


// Count character in String
fun main() {
    val str = "Varanasi"
    val charCount = mutableMapOf<Char, Int>()
    for (char in str) {
        if (charCount.containsKey(char)) {
            charCount[char] = charCount[char]!! + 1
        } else {
            charCount[char] = 1
        }
    }
    println(charCount)
}