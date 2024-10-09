package com.sahilpvns.kotlinProgram.integerProgram

// Fibonacci Series
fun main() {
    val n = 10
    var t1 = 0
    var t2 = 1
    print("First $n terms: ")
    for (i in 1..n) {
        print("$t1 + ")
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

// First 10 terms: 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 +
