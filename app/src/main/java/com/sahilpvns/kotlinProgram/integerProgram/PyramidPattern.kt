package com.sahilpvns.kotlinProgram.integerProgram

fun main() {
    var num = 18
    for (i in 3 downTo 1) {
        for (j in 1..i) {
            print("$num ")
            num -= 3
        }
        println()
    }
}