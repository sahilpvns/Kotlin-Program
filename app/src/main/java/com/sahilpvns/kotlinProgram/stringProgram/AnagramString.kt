package com.sahilpvns.kotlinProgram.stringProgram


// Two String Anagram in Kotlin
fun main() {
    val str1 = "listen"
    val str2 = "silent"
    if (str1.length != str2.length) {
        println("$str1 and $str2 are not anagrams")
    }
    val charArray1 = str1.toCharArray()
    val charArray2 = str2.toCharArray()
    charArray1.sort()
    charArray2.sort()
    if (charArray1.contentEquals(charArray2)) {
        println("$str1 and $str2 are anagrams")
    } else {
        println("$str1 and $str2 are not anagrams")
    }
}