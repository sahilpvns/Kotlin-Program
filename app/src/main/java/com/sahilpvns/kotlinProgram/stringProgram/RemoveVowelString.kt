package com.sahilpvns.kotlinProgram.stringProgram

//Remove Vowel in String
fun main(){
    val originalString = "Google"
    val vowel = "aeiouAEIOU"
    val newString = originalString.filter { it !in vowel }
    println(newString)
}

// Ggl