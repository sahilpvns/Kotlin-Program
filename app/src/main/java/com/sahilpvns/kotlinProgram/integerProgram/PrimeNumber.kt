package com.sahilpvns.kotlinProgram.integerProgram

// Print all prime numbers upto the given number in Kotlin
fun main() {
    val number = 20
    for (i in 2..number) {
        var flag = 0
        for (j in 2..i / 2) {
            if (i % j == 0) {
                flag = 1
                break
            }
        }
        if (flag == 0) {
            println("$i is a prime number")
        } else {
            println("$i is not a prime number")
        }
    }


}