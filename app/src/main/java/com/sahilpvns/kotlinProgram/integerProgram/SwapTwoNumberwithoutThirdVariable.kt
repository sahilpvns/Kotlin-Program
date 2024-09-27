package com.sahilpvns.kotlinProgram.integerProgram


// Swap two numbers without using a temporary variable in Kotlin
fun main() {
    var a = 10
    var b = 20
    println("Before swapping: a = $a, b = $b")
    a = a + b // a = 30
    b = a - b // b = 10
    a = a - b // a = 20
    println("After swapping: a = $a, b = $b")

}