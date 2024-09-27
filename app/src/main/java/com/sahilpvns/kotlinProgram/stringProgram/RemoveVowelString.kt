package com.sahilpvns.kotlinProgram.stringProgram

//Remove Vowel in String
fun main(){
    val vowel = "aeiouAEIOU"
    val originalString = "Google"
    val newString = originalString.filter { it !in vowel }
    println(newString)
}